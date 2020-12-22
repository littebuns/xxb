package com.example.demo.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Dog {

    private String name;
    private Integer age;

    static Integer i = 0;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void initMethod(){
      log.info("dog 的初始方法");
    }

    public void destroyMethod(){
        log.info("dog 的销毁方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog() {
        System.out.println("创建了一个dog" + i);
        i ++;
    }
}
