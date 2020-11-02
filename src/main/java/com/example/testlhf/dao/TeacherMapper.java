package com.example.testlhf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.testlhf.entity.Teacher;

import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yyf
 * @since 2020-03-11
 */
public interface TeacherMapper extends BaseMapper<Teacher> {
    void insertOrUpdateWithMap(Map<String,Object> map);
}
