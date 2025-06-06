package com.homework.demo01;

import java.util.*;

public class Text2 {
    public static void main(String[] args) {
        Map<Integer,Student> student = new HashMap<>();
        student.put(0,new Student("蔡徐坤",18,152));
        student.put(1,new Student("范丞丞",19,187));
        student.put(2,new Student("陈立龙",14,154));
        student.put(3,new Student("蔡徐坤",18,159));

        student.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println("=======================================");
        student.remove(3);
        student.put(3,new Student("杨小龙",23,171));
        student.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println(student.get(3));
        System.out.println(student.containsKey(3));
        Set<Integer> integers = student.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        Collection<Student> student1= student.values();
        for (Student student2 : student1) {
            System.out.println(student2);

        }

    }
}
