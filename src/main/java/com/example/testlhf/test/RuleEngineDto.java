package com.example.testlhf.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/28 15:17
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class RuleEngineDto {
    /**
     * 规则ID
     */
    private String ruleId;
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 规则类型 0-批量，1-实时
     */
    private String postType;
    /**
     * 是否月累积 Y-是，N-否
     */
    private String mnthHeap;

    /**
     * 规则回馈
     */
    private List<RuleEngineResultDto> feedbackList;

}
