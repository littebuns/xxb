package com.example.demo.utils.poi;

import com.example.demo.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@Slf4j
public class ExportExcel {


    /**
     * 浏览器导出excel
     * @param response
     * @param list 数据源
     * @param start 起始索引
     * @param end
     * @return
     */
    public static Result exportExcel(HttpServletResponse response, List<Map<String, Object>> list, int start, int end) throws Exception{
        try {
            //创建一个excel的文档对象
            HSSFWorkbook wb = new HSSFWorkbook();
            //创建excel的一个表单
            HSSFSheet sheet = wb.createSheet("表单1");

            for (int i = start; i < end ; i++) {
                HSSFRow row = sheet.createRow(i);
                row.createCell(0).setCellValue(list.get(i).get("name").toString());
                row.createCell(1).setCellValue(list.get(i).get("password").toString());
            }

            //创建表头
            HSSFRow row = sheet.createRow(0);
            row.createCell(0).setCellValue("工号");
            row.createCell(1).setCellValue("姓名");



            //输出Excel文件
            ServletOutputStream outputStream = response.getOutputStream();

            //设置下载
            String cnFileName = URLEncoder.encode("平台报表.xls", "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename = 袁中林.xls " + cnFileName );
            wb.write(outputStream);
            outputStream.close();

            return new Result(true, "导出成功");
        }catch (Exception e){
            log.error("export error", e);
            return new Result(false, "导出失败");
        }
    }
}
