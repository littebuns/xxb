package com.example.demo.test.dao;

import com.example.demo.Dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        userDao.listAll();
    }
}
