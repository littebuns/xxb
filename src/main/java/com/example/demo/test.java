package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


@Slf4j
public class test {


    public static void main(String[] args) throws Exception{
        String time = "2019-12-29 00:00:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse(time));
        calendar.add(Calendar.DAY_OF_WEEK, -1);
        calendar.setMinimalDaysInFirstWeek(4);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        int j = calendar.get(Calendar.WEEK_OF_YEAR);
        int year = calendar.get(Calendar.YEAR);
        int year1 = calendar.getWeekYear();
        System.out.println(year1);
        System.out.println(calendar.getTime());
        System.out.println(i);
        System.out.println("第"+ year1 + "年"+ "第" + j + "周");


    }



}
