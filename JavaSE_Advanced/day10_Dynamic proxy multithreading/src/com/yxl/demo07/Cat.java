package com.yxl.demo07;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("吃猫饭");
    }

    @Override
    public void sleep() {
        System.out.println("睡眠猫");
    }
}
