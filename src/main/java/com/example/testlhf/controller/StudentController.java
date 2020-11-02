package com.example.testlhf.controller;


import com.example.testlhf.config.Person;
import com.example.testlhf.entity.Student;
import com.example.testlhf.request.AddStudentRequset;
import com.example.testlhf.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
@RestController
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private Person person;

    @GetMapping("/student/testTran")
    public void testTran() {
        studentService.testTranscationl();
    }

    @PostMapping("/student/addStudent")
    public void addStudent(@RequestBody AddStudentRequset addStudentRequset) {
        log.info("修改之后的登录用户为：" + addStudentRequset.getHead().getLogInUserName());
        studentService.addStudents(addStudentRequset);
    }
}

