package com.example.testlhf.test;

import com.example.testlhf.utils.RedisUtils;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/12/28 16:20
 * @Version 1.0
 **/
@Component
public class TestRedis {
    public static void main(String[] args) {
        Object aa = RedisUtils.get("aa");
        System.out.println(aa.toString());
    }
}
