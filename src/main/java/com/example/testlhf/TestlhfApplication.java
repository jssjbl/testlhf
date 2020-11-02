package com.example.testlhf;

import com.example.testlhf.filter.ReplaceStreamFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.testlhf.dao"})
public class TestlhfApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestlhfApplication.class, args);
    }

}
