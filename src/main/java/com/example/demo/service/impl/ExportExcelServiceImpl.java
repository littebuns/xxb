package com.example.demo.service.impl;

import com.example.demo.dao.OpenstackDao;
import com.example.demo.entity.Result;
import com.example.demo.service.ExportExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
@Service
public class ExportExcelServiceImpl implements ExportExcelService  {

    @Autowired
    private OpenstackDao openstackDao;


    @Override
    public Result threadExport(HttpServletResponse response) {
        try{
            //先去查询一共有多少条数据
            int count = openstackDao.count();
            int num = 5; //一次性去查500条
            int times = count /num; //需要去查几次
            if (count % num != 0){
                times = times + 1;
            }

            //申请一个线程池
            ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
            ExecutorCompletionService<List<Map<String, Object>>> completionService = new ExecutorCompletionService<>(fixedThreadPool);
            List<Integer> timeList = new ArrayList();
            //防止内部类无法访问局部变量，将查的次数放入List中
            for (int i = 0; i < times; i++) {
                timeList.add(i);
            }

            //开启线程
            for (Integer i : timeList) {
                Future<List<Map<String, Object>>> submit = completionService.submit(() -> {
                    List<Map<String, Object>> list = openstackDao.list(i * num, num);
                    System.out.println(Thread.currentThread().getName() + "正在查询");
                    return list;
                });
            }

            List<Map<String, Object>> listAll = new ArrayList<>();

            for (Integer i : timeList) {
                //CompletionService方法可以通过completionService.take().get()方法获取最快完成的线程的返回结果
                // （若当前没有线程执行完成则阻塞直到最快的线程执行结束），第二次调用则返回第二快完成的线程的返回结果
                List<Map<String, Object>> list = completionService.take().get();
                listAll.addAll(list);
            }
            log.info("查询到{}条记录", listAll.size());
            for (Map<String, Object> map : listAll) {
                System.out.println(map);
            }
//            for (int i = 0; i < times; i++) {
//                fixedThreadPool.execute(new queryThread(i, num, response));
//            }
            return new Result(true, "导出成功");
        }catch (Exception e){
            log.error("export excel error", e);
            return new Result(false, "导出失败");
        }
    }

    //执行查询任务的线程
    class queryThread implements Runnable {

        private int times;
        private int num;
        private HttpServletResponse response;

        queryThread() {
        }

        queryThread(int times, int num, HttpServletResponse response) {
            this.num = num;
            this.times = times;
            this.response = response;
        }

        @Override
        public void run(){
            long startTime = System.currentTimeMillis();
            int start = times * num + 1;
            int end = (times + 1) * num;
            List<Map<String, Object>> list = openstackDao.list(start, end);
            long endTime = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+ "  第" + times + "次查询时间:" + (endTime-startTime) + "ms");
        }
    }




}
