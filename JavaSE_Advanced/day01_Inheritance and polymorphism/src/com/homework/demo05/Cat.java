package com.homework.demo05;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("喵喵喵");
    }
    public void eat(){
        System.out.println("吃鱼");
    }
}

