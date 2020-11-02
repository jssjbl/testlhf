package com.example.testlhf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testlhf.dao.TeacherMapper;
import com.example.testlhf.entity.Teacher;
import com.example.testlhf.service.TeacherService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void addTwoTeachers() {
        Teacher teacher1 = new Teacher(1, "yyf", "29");
        Teacher teacher2 = new Teacher(1, "yyf2", "29");
        teacherMapper.insert(teacher1);
        teacherMapper.insert(teacher2);
    }

    public static void main(String[] args) throws  Exception{
        Teacher teacher1 = new Teacher(1, "yyf", "29");
        Map<String, String> describe = BeanUtils.describe(teacher1);
        System.out.println(describe);
    }
}
