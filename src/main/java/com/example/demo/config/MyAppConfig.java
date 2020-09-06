package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 表明当前类是配置类，代替之前的Spring配置文件
 * 配置文件中使用<bean></bean>添加组件
 */

@Configuration
public class MyAppConfig {


    @Bean
    public HelloService helloService1(){
        System.out.println("容器中添加了组件helloService1");
        return new HelloService();
    }
}
