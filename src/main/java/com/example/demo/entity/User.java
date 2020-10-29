package com.example.demo.entity;

import lombok.Data;

@Data
public class User {

    private int id; //用户id

    private String name;

    private String password;

    private Dog dog;

    public User() {
        System.out.println("创建了一个User");
    }
}
