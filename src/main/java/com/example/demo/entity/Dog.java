package com.example.demo.entity;

import lombok.Data;

@Data
public class Dog {

    private String name;
    private Integer age;

    static Integer i = 0;

    public Dog() {
        System.out.println("创建了一个dog" + i);
        i ++;
    }
}
