package com.example.demo.entity;

import lombok.Data;

/**
 * @author HP
 */
@Data
public class User {

    private int id;

    private String name;

    private String password;

    private Dog dog;

    /**
     * 用户状态
     */
    private String status;

}
