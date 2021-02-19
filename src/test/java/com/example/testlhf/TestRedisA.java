package com.example.testlhf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2021/1/11 11:03
 * @Version 1.0
 **/

@SpringBootTest
public class TestRedisA {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void doSomething() {
        redisTemplate.opsForValue().set("aaa", "aaaaaaaa");
        LocalDate localDate = LocalDate.now();
//        redisTemplate.expireAt("aa",  Date.from(localDate.plusDays(1).atStartOfDay(ZoneOffset.ofHours(8)).toInstant()));
        redisTemplate.expireAt("aa",  Date.from(localDate.plusDays(1).atStartOfDay( ZoneId.systemDefault()).toInstant()));



    }
}
