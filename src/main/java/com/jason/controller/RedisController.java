package com.jason.controller;

import com.jason.pojo.User;
import com.jason.service.RedisService;
import com.jason.service.StringRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;
    @Autowired
    private StringRedisService stringRedisService;

    @RequestMapping("/save")
    public void save(){
        redisService.save();
    }
    @GetMapping("/get")
    public String get(){
        String s = redisService.get();
        return s;
    }
    @RequestMapping("/stringsave")
    public void stringSave(){
        stringRedisService.stringSave();
    }
    @GetMapping("/stringget")
    public User strGet(){
        User s = stringRedisService.stringGet();
        return s;
    }
}
