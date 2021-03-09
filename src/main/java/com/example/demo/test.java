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


    private String str1 = "String域";
    private String str2;

    public test() {
        str2 = "构造器初始化";
    }

    public static void main(String[] args) throws Exception{
        test test = new test();
        System.out.println(test.str1);
        System.out.println(test.str2);


    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length; i ++){
            for(int j = 0 ; j < nums.length; j ++){
                if (nums[i] == nums[j]){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    result[1] = j;
                    result[0] = i;
                    return result;
                }
            }
        }
        return result;
    }

}
