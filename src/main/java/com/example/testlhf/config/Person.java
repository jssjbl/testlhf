package com.example.testlhf.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @Description
 * @Author PC
 * @Date 2020/5/26 16:17
 **/
@Component
@ConfigurationProperties(prefix = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private List<Map<String, String>> list;
    private String wife;
    private String son;
    private Integer age;

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE).substring(0, 6));
        System.out.println(Integer.valueOf(1) == 1);
        LocalDate localDate = LocalDate.parse("20200601", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate is " + localDate);
        LocalDateTime localDateTimeStart = LocalDateTime.of(localDate, LocalTime.MIN);
        System.out.println("localDateTimeStart is " + localDateTimeStart.format(DateTimeFormatter.ISO_DATE_TIME));
        LocalDateTime localDateTimeEnd = LocalDateTime.of(localDate, LocalTime.MAX);
        System.out.println("localDateTimeEnd is " + localDateTimeEnd.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("==========");
        System.out.println("localDateTimeEnd is " + localDateTimeStart.minusDays(1).format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("localDateTimeEnd is " + localDateTimeEnd.minusDays(1).format(DateTimeFormatter.ISO_DATE_TIME));
        Set<String> set = new HashSet<>();
        for (String s : set) {
            System.out.println(s);
        }
        Integer integer = null;
        Person person = new Person();
        person.setAge(integer);
        System.out.println(person);


    }

    @Override
    public String toString() {
        return "Person{" +
                "list=" + list +
                ", wife='" + wife + '\'' +
                ", son='" + son + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
