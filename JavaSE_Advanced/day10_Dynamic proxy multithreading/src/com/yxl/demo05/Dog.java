package com.yxl.demo05;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("吃狗肉");
    }

    @Override
    public void sleep() {
        System.out.println("睡狗觉");

    }
}
