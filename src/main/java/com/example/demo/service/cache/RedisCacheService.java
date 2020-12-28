package com.example.demo.service.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @author HP
 */

@Component("redisCache")
public class RedisCacheService {

    @Autowired
    private StringRedisTemplate redisTemplate;


    public void putCache(String key, String value){
        ValueOperations<String, String> ops = this.redisTemplate.opsForValue();
        ops.getAndSet(key, value);
    }


    public String getCache(String key){
        ValueOperations<String, String> ops = this.redisTemplate.opsForValue();
        return ops.get(key);
    }


}
