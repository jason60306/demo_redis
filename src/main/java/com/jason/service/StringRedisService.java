package com.jason.service;

import com.alibaba.fastjson.JSON;
import com.jason.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StringRedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void stringSave(){
        User user = new User(2021001l,"花花",30);
        String jsonUser = JSON.toJSONString(user);
        stringRedisTemplate.opsForValue().set("user",jsonUser);
        stringRedisTemplate.opsForValue().set("name","小黑");
    }
    public User stringGet(){
        String user = stringRedisTemplate.opsForValue().get("user");
        User user1 = JSON.parseObject(user, User.class);
        return user1;
    }
}
