package com.yxl.staticXiuShi;

public class Code8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.schoolName = "第一中学";
        Student.grade = 3;
        s1.age = 18;
        s1.name = "张三";
        System.out.println(s1);
        Student s2 = new Student();
        s2.age = 20;
        s2.name = "李四";
        System.out.println(s2);
        Student.aug();
        s1.auv();
    }
}
