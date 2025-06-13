package com.homework.demo05;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("狗叫");
    }
    public void run(){
        System.out.println("跑向主人");
    }
}
