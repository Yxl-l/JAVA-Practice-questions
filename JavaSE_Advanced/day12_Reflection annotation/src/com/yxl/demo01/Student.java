package com.yxl.demo01;

public class Student {
    private String name;
    private int age;

    public void eat(){
        System.out.println("吃火鸡面");
    }
    private void eat(String nameEat){
        System.out.println("吃"+nameEat);
    }

    public Student() {
        System.out.println("无参构造");
    }


    private Student(int age) {
        this.age = age;
        System.out.println("一个参构造");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("一个参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

