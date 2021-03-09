package com.example.demo.base.java.keyWorld.Reflection;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class ProxyDemonTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void main() {
        System.out.println(dataSource);
    }
}