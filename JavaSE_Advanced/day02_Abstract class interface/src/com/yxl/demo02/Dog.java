package com.yxl.demo02;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃屎");
    }

    @Override
    public void sleep() {
        System.out.println("狗叫");

    }
}
