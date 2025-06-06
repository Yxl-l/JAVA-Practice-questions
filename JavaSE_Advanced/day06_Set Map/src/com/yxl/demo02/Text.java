package com.yxl.demo02;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Text {
    public static void main(String[] args) {
      Set<Student> students = new TreeSet<> ((o1,o2)->o1.getAge()-o2.getAge());
      students.add(new Student("蔡徐坤",18,180));
      students.add(new Student("范丞丞",38,190));
      students.add(new Student("蔡徐坤",19,180));
      students.add(new Student("陈立龙",28,170));
      students.add(new Student("龙",58,170));
      students.add(new Student("54254",17,170));

        for (Student student : students) {
            System.out.println(student);

        }
    }
}