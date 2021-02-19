package com.example.testlhf.controller;

import com.example.testlhf.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/12/28 18:36
 * @Version 1.0
 **/
@RestController
@RequestMapping("redis")
@Api("redis的一些方法")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation("测试批量删除匹配的建")
    @PostMapping("delKeys")
    public void redisDel() {
        RedisUtils.set("aa", "aab");
//        RedisUtils.set("aaa", "aaab");
//        RedisUtils.set("aaaa", "aaaab");
//        Set<String> keys = redisTemplate.keys("aa" + "*");
//        redisTemplate.delete(keys);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,1);
        System.out.println(calendar.getTime());
        redisTemplate.expireAt("aa",calendar.getTime());
    }
}
