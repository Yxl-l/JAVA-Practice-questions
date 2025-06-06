package com.homework.dome02;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void run() {
        System.out.println("跑来主人");
    }
}
