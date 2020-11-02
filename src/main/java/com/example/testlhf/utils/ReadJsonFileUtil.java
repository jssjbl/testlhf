package com.example.testlhf.utils;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author yyf
 * @Date 2020/7/14 18:03
 * @Version 1.0
 **/
public class ReadJsonFileUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadJsonFileUtil.class);

    public static List<Map<String, Object>> readJsonFile(String fileName) {
        String jsonStr;
        List<Map<String, Object>> list = new ArrayList<>();
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))
        ) {
            while ((jsonStr = bufferedReader.readLine()) != null) {
                Map map = JSON.parseObject(jsonStr);
                list.add(map);
            }

        } catch (IOException e) {
            LOGGER.error("文件转化异常{}", e);
        }
        return list;
    }
}
