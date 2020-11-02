package com.example.testlhf.filter;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/10/29 12:50
 * @Version 1.0
 **/

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 01
 * @program wrapper-demo
 * @description 替换HttpServletRequest

 * @create 2018-12-24 21:04
 * @since 1.0
 **/
@Slf4j
public class ReplaceStreamFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("StreamFilter初始化...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        ServletRequest requestWrapper = new ChangeTenantIdRequestWrapper((HttpServletRequest) request);
//        chain.doFilter(requestWrapper, response);

        ServletRequest requestWrapper = null;
        if(request instanceof HttpServletRequest) {
            requestWrapper = new ChangeTenantIdRequestWrapper((HttpServletRequest) request);
        }
        //获取请求中的流如何，将取出来的字符串，再次转换成流，然后把它放入到新request对象中。
        // 在chain.doFiler方法中传递新的request对象
        if(requestWrapper == null) {
            chain.doFilter(request, response);
        } else {
            chain.doFilter(requestWrapper, response);
        }
    }

    @Override
    public void destroy() {
        log.info("StreamFilter销毁...");
    }
}