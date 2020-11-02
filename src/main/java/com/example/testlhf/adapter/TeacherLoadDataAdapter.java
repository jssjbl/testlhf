package com.example.testlhf.adapter;

import com.example.testlhf.dao.StudentMapper;
import com.example.testlhf.dao.TeacherMapper;
import com.example.testlhf.utils.ReadJsonFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/15 14:48
 * @Version 1.0
 **/
@Component
public class TeacherLoadDataAdapter implements LoadDataAdapter {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public boolean support(String dataPath) {
        return dataPath.contains("teachers.dat");
    }

    @Override
    public void handler(String dataPath) {
        List<Map<String, Object>> list = ReadJsonFileUtil.readJsonFile(dataPath);
        list.forEach(e -> teacherMapper.insertOrUpdateWithMap(e));
    }
}
