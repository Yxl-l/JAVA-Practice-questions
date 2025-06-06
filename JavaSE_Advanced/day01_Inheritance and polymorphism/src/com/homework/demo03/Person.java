package com.homework.demo03;

public class Person {
    private  String name;

    public Person() {
        System.out.println("父类空参构造器执行了");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("父类有参构造器执行了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
