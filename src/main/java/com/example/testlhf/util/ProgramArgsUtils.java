package com.example.testlhf.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author PC
 * @Date 2020/6/11 16:11
 **/
@Configuration
@Setter
@Getter
public class ProgramArgsUtils {
    public ProgramArgsUtils() {
    }
    @Autowired
    private  ApplicationArguments applicationArguments;
    public  String date;

    public  void initArgs() {
        System.out.println("参数为：date=20200611 name=yyf --port=1234 --server=ddd --port=1235 ceshi");
        List<String> nonOptionArgs = applicationArguments.getNonOptionArgs();
        for (int i = 0; i < nonOptionArgs.size(); i++) {
            System.out.println("applicationArguments.getNonOptionArgs()   " + nonOptionArgs.get(i));
        }
        Set<String> optionNames = applicationArguments.getOptionNames();
        Iterator<String> iterator = optionNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("applicationArguments.getOptionNames()   " + iterator.next());
        }
        String[] sourceArgs = applicationArguments.getSourceArgs();
        for (int i = 0; i < sourceArgs.length; i++) {
            System.out.println("applicationArguments.getSourceArgs()   " + sourceArgs[i]);
        }
        System.out.println("applicationArguments.getOptionValues(\"name\")=======" + applicationArguments.getOptionValues("port"));

    }
}
