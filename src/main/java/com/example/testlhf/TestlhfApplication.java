package com.example.testlhf;

import com.example.testlhf.utils.RedisUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Set;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.testlhf.dao"})
public class TestlhfApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestlhfApplication.class, args);

    }

}
