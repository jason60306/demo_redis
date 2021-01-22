package com.jason.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void save(){
        redisTemplate.boundHashOps("redis").put("name","小白");
    }
    public String get(){
        String  name = (String) redisTemplate.boundHashOps("redis").get("name");
        return name;
    }
}
