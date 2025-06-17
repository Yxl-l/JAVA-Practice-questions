package com.homework.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student("cxk",18,1990);
        students[1]=new Student("cxk",13,170);
        students[2]=new Student("cxk",20,188);
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(students,( o1, o2)->Double.compare(o1.getHeight(),o2.getHeight()));

     Arrays.sort(students,(o1,o2)->Double.compare(o2.getHeight(),o1.getHeight()));




        for (Student student: students){
            System.out.println(student);
        }

    }
}
