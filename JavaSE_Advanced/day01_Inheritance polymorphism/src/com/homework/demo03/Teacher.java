package com.homework.demo03;

public class Teacher  extends Person{
    private int classId;
    private int age;

    public Teacher(int classId, int age) {

        this.classId = classId;
        this.age = age;
    }

    public Teacher() {
        System.out.println("子类空参构造器执行了");
    }

}
