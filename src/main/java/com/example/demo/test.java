package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class test {

    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) throws Exception{

    }

    private void redis(){
        this.redisTemplate.opsForValue();
    }
}
