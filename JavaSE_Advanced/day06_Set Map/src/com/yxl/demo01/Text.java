package com.yxl.demo01;

import java.util.HashSet;
import java.util.Set;

public class Text {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("蔡徐坤", 25, 180));
        students.add(new Student("陈立龙", 26, 190));
        students.add(new Student("蔡徐坤", 25, 180));
        students.add(new Student("蔡徐坤", 25, 180));
        students.add(new Student("丁程鑫", 25, 180));
        students.add(new Student("马嘉祺", 25, 180));
        students.add(new Student("范丞丞", 24, 170));
        students.add(new Student("蔡徐坤", 25, 180));

        for (Student student : students) {
            System.out.println(student);
        }

    }
}