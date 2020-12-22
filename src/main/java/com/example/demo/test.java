package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class test {

    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) throws Exception{
        String str = "[{\"xxb\":\"xxb\"},{\"wx\":\"wx\"}]";
        ArrayList<JSONObject> list = new ArrayList<>();
        JSONArray jsonArray = JSONArray.parseArray(str);
        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(jsonArray.getJSONObject(i));
        }
        for (JSONObject object : list) {
            System.out.println((Map) object);
        }
        System.out.println(list);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("xxb", "xxb");
        jsonObject.put("1", "1");

        String s = jsonObject.toString();
        System.out.println(s);

    }

    private void redis(){
        this.redisTemplate.opsForValue();
    }


}
