package com.yxl.object;

public class Student {
    private String name;
    private int age;

    public void setAge(int a) {
        if (a < 0 || a > 150){
            System.out.println("年龄输入错误");
        }
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
