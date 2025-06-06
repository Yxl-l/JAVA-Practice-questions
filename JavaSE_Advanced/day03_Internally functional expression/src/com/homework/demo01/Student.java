package com.homework.demo01;

public class Student {
    static String name;
    static int a;
    static {
        name="蔡徐坤";
    }
    public Student() {
    }
    {
        a++;
    }

    public Student(String name) {
        Student.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Student.a = a;
    }

}
