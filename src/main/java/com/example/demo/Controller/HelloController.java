package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    //通过@Value注解获取配置文件中的值
    @Value("${person.name}")
    private String name;

    @GetMapping("hello")
    public String hello(){
//        System.out.println(dataSource);
        return "Hello world" + name;
    }
}
