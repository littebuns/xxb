package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 查看登录用户是否存在
     * @return
     */
    List<User> listAll();
}
