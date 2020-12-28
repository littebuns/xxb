package com.example.demo.service.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisCacheServiceTest {

    @Autowired
    private RedisCacheService redisCache;

    @Test
    public void putCache() {
        redisCache.putCache("12-28", "xxb");
    }

    @Test
    public void getCache() {
        String cache = redisCache.getCache("12-28");
        System.out.println(cache);
    }
}