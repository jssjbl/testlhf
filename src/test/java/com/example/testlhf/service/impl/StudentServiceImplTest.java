package com.example.testlhf.service.impl;

import com.example.testlhf.entity.Student;
import com.example.testlhf.service.StudentService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {
    @Autowired
    private StudentService studentService;

    @Test
    void testTranscationl() {
//        studentService.addStudents(new Student());
    }

    @Test
    void testInsertOrUpdate() throws Exception {
        Student student = new Student(646950, "yyf1", 32, LocalDate.now(), LocalDateTime.now(),LocalDateTime.now());
        Map<String, Object> map = new HashMap<>();
        map.put("id", 646950);
        map.put("name", "yyf1");
        map.put("age", 30);
        Map<String, Object> describe = PropertyUtils.describe(student);
//        studentService.insertOrUpdateWithMap(describe);
        studentService.insertOrUpdateWithEntity(student);
    }

    @Test
    void loadData() {
        studentService.loadData("D:\\wenjianchaifen\\teachers.dat");
    }
}