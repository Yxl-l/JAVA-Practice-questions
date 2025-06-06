package com.yxl.demo02;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");

    }
}
