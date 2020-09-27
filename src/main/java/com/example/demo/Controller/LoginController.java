package com.example.demo.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "请登录";
    }

    @PostMapping("/test1")
    public void test1(@RequestBody String params){
        System.out.println(params);
    }

    @PostMapping("/test2")
    public void test2(@RequestParam(value = "params") String params){
        System.out.println(params);
    }
}
