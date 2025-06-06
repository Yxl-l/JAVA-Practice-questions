package com.homework.demo03;

public class Student extends Person{
   private String className;
   private int work;

    public Student(String className, int work) {
        this.className = className;
        this.work = work;
    }
    public Student(int work){
        this("java",work);
    }

    public Student() {
    }
}
