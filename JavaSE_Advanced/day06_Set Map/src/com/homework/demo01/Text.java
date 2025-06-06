package com.homework.demo01;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Text {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Collections.addAll(
                students,
                new Student("蔡徐坤",18,250),
                new Student("范丞丞",23,210),
                new Student("蔡徐坤",178,2150),
                new Student("蔡徐坤",128,233350),
                new Student("范丞丞",23,210),
                new Student("蔡徐坤",18,250)
        );
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
