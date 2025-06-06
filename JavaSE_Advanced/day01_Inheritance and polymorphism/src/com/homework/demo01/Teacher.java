package com.homework.demo01;

public class Teacher extends Person{
   private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "className='" + className + '\'' +
                '}';
    }
}
