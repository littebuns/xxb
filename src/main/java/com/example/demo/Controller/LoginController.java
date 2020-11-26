package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        return "请登录";
    }

    @PostMapping("/test1")
    public void test1(@RequestBody String params, HttpServletRequest request){
//        try {
//            request.setCharacterEncoding("UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        System.out.println(params);
        System.out.println(request.getHeader("version"));
        System.out.println(request.getHeader("Content-Type"));
    }

    @PostMapping("/test2")
    public void test2(@RequestParam(value = "params") String params){
        System.out.println(params);
    }


}
