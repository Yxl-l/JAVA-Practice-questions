package com.yxl.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Text03 {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("张三",5000));
        students.add(new Student("金毛狮王",16000));
        students.add(new Student("李四",6000));
        students.add(new Student("王五",7000));
        students.add(new Student("白眉鹰王",10800));
        students.add(new Student("陈昆",48000));
        List<Student> names = students.stream().filter(s->s.getScore()>10000).toList();
        names.forEach(System.out::println);
        Map<String,Double> map = students.stream().filter(student -> student.getScore()<10000).collect(Collectors.toMap(s -> s.getName(),s -> s.getScore()));
        map.forEach((k,v)-> System.out.println(k+""+v));


    }
}
