package com.example.demo.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Result;
import com.example.demo.service.HelloService;
import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("helloService")
public class HelloServiceImpl implements HelloService {



    @Override
    public Result patch() {

        try {
            //springboot 官方的一个json格式接口
            String url = "https://gturnquist-quoters.cfapps.io/api/random";
            RestTemplate restTemplate = new RestTemplate();

            //抓数据
            ResponseEntity<JSONObject> object = restTemplate.getForEntity(url, JSONObject.class);

            return new Result(true, object.getBody());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "接口调用失败");

        }

    }
}
