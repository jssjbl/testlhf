package com.example.testlhf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testlhf.entity.Student;
import com.example.testlhf.request.AddStudentRequset;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
public interface StudentService extends IService<Student> {
    void testTranscationl();

    void addTeachers();

    void addStudents(AddStudentRequset addStudentRequset);

    int insertOrUpdateWithMap(Map<String ,Object> map);
    int insertOrUpdateWithEntity(Student student);
    void loadData(String dataPath);

}
