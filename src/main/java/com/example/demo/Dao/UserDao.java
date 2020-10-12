package com.example.demo.Dao;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    /**
     * 查看登录用户是否存在
     * @return
     */
    List<User> listAll();
}
