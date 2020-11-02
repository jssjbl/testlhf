package com.example.testlhf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testlhf.entity.Teacher;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
public interface TeacherService extends IService<Teacher> {
    void addTwoTeachers();

}
