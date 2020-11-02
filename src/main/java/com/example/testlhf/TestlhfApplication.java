package com.example.testlhf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.testlhf.dao"})
public class TestlhfApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestlhfApplication.class, args);
    }

}
