package com.example.testlhf.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/28 15:18
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class RuleEngineResultDto {
    /**
     * 字段名
     */
    private String fieldName;
    /**
     * 字段值
     */
    private String value;
    /**
     * 回馈字段类型
     */
    private String fieldType;
}

