package com.homework.demo01;

public class Text {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setClassName("java");
        t1.setName("qqqq");
        Student s1=new Student();
        s1.setClassId(10);
        s1.setName("yxl");
        System.out.println(s1+"-"+t1);

    }
}
