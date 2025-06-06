package com.yxl.GAME;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,new Student("陈立龙",28,170),new Student("蔡徐坤",58,170),
                new Student("陈立龙",28,170),new Student("54254",17,170));
        Collections.sort(students,(s1,s2)->s1.getAge()- s2.getAge());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("============");
        Collections.shuffle(students);
        for (Student student : students) {
            System.out.println(student);
        }



    }
}
