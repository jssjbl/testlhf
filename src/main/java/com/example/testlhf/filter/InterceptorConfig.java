package com.example.testlhf.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/10/29 12:56
 * @Version 1.0
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public ChangeTenantIdInterceptor getSignatureInterceptor(){
        return new ChangeTenantIdInterceptor();
    }

    /**
     * 注册拦截器
     *
     * @param registry registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getSignatureInterceptor())
                .addPathPatterns("/**")
        .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");
    }
}
