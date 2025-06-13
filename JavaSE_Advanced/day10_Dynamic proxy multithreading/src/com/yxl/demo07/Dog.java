package com.yxl.demo07;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("吃狗饭");
    }

    @Override
    public void sleep() {
        System.out.println("睡狗觉");

    }
}
