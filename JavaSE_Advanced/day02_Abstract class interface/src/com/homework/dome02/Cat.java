package com.homework.dome02;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃🐟");
    }

    @Override
    public void run() {
        System.out.println("跑走");
    }
}
