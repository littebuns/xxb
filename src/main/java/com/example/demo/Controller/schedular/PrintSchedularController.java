package com.example.demo.Controller.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@Component
@RestController
public class PrintSchedularController {

    /**
     * 这是个定时任务
     * 秒（Seconds）	0~59的整数	, - * /    四个字符
     * 分（Minutes）	0~59的整数	, - * /    四个字符
     * 小时（Hours）	0~23的整数	, - * /    四个字符
     * 日期（DayofMonth）	1~31的整数（但是你需要考虑你月的天数）	,- * ? / L W C     八个字符
     * 月份（Month）	1~12的整数或者 JAN-DEC	, - * /    四个字符
     * 星期（DayofWeek）	1~7的整数或者 SUN-SAT （1=SUN）	, - * ? / L C #     八个字符
     * 年(可选，留空)（Year）	1970~2099	, - * /    四个字符
     */
    @GetMapping("/print")
    @Scheduled(cron = "* 30/60 * * * ?")
    private void PrintController(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(System.currentTimeMillis());
        System.out.println(format + "定时任务");
    }

}
