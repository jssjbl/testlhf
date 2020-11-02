package com.example.testlhf.adapter;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/15 14:47
 * @Version 1.0
 **/
public interface LoadDataAdapter {
    boolean support(String dataPath);
    void handler(String dataPath);
}
