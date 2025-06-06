package com.homework.demo01;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Text1 {
    public static void main(String[] args) {
       Set<Student> students = new TreeSet<>((s1,s2)-> s1.getAge()- s2.getAge());
        Collections.addAll(
                students,
                new Student("蔡徐坤",18,250),
                new Student("范丞丞",23,210),
                new Student("蔡徐坤",178,2150),
                new Student("蔡徐坤",128,233350),
                new Student("范丞丞",23,210),
                new Student("蔡徐坤",148,2180)
        );
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
