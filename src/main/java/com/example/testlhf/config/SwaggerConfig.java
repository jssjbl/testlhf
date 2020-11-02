package com.example.testlhf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author yyf
 * @description swagger配置类
 * @date 2020/2/7
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Value("${application.name}")
//    private String applicationName;
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("yyf", "", "yifei.yang@jrx.com");
        return new ApiInfo(
//                applicationName,
                "测试",
                "这里是我的测试的接口",
                "1.0",
                "",
                contact,
                "",
                "",
                new ArrayList<>()
                );
    }
}
