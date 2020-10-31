package com.example.demo.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Dog {

    private String name;
    private Integer age;

    static Integer i = 0;

    public void initMethod(){
      log.info("dog 的初始方法");
    }

    public void destroyMethod(){
        log.info("dog 的销毁方法");
    }

    public Dog() {
        System.out.println("创建了一个dog" + i);
        i ++;
    }
}
