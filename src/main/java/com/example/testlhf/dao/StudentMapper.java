package com.example.testlhf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.testlhf.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    int insertOrUpdateWithMap(Map<String, Object> map);
    int insertOrUpdateWithEntity(Student student);
    Student findOne(Student student);

}
