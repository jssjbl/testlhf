package com.example.testlhf.util;

import com.example.testlhf.dao.StudentMapper;
import com.example.testlhf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/29 18:23
 * @Version 1.0
 **/
@Component
public class DataCache {
    @Autowired
    private StudentMapper studentMapper;
    private static Map<String,Student> studentsMap=new HashMap<>();
    public static void initStudentMap(){
//        studentsMap=studentMapper.selectByMap()
    }
}
