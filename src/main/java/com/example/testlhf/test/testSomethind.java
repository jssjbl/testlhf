package com.example.testlhf.test;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.testlhf.entity.Student;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/8 14:20
 * @Version 1.0
 **/
@Data
public class testSomethind {
    private Student student;
    public void doStu(testSomethind testSomethind){
        Student student1 = testSomethind.getStudent();
        student1.setName("sdfff");
    }
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.forEach(e -> System.out.println(e));
//        testSomethind testSomethind=new testSomethind();
//        Student student = new Student(1, "yyf", 30, LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
//        testSomethind.setStudent(student);
//        testSomethind.doStu(testSomethind);
//        System.out.println(testSomethind);
        String listStr="A,B,C";
        List<String> list= Arrays.asList(listStr.split(","));
        System.out.println(list.get(0));
        RuleEngineDto ruleEngineDto = new RuleEngineDto();
        ruleEngineDto.setMnthHeap("Y");
        ruleEngineDto.setPostType("0");
        ruleEngineDto.setRuleId("123");
        ruleEngineDto.setRuleName("123的规则名称");
        RuleEngineResultDto ruleEngineResultDto1 = new RuleEngineResultDto();
        RuleEngineResultDto ruleEngineResultDto2 = new RuleEngineResultDto();
        RuleEngineResultDto ruleEngineResultDto3 = new RuleEngineResultDto();
        ruleEngineResultDto1.setFieldName("字段名称1");
        ruleEngineResultDto1.setFieldType("字段类型1");
        ruleEngineResultDto1.setValue("字段值");
        ruleEngineResultDto2.setFieldName("字段名称1");
        ruleEngineResultDto2.setFieldType("字段类型1");
        ruleEngineResultDto2.setValue("字段值");
        ruleEngineResultDto3.setFieldName("字段名称1");
        ruleEngineResultDto3.setFieldType("字段类型1");
        ruleEngineResultDto3.setValue("字段值");
        List<RuleEngineResultDto> list1=new ArrayList<>();
        list1.add(ruleEngineResultDto1);
        list1.add(ruleEngineResultDto2);
        list1.add(ruleEngineResultDto3);
        ruleEngineDto.setFeedbackList(list1);
        System.out.println(JSONObject.toJSONString(ruleEngineDto));

    }
}
