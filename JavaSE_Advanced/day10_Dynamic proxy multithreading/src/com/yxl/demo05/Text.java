package com.yxl.demo05;

public class Text {
    public static void main(String[] args) {
        new EatProxy(new Cat()).eat();
        new EatProxy(new Dog()).sleep();

        AnimalProxy.AProxy(new Dog()).eat();
        AnimalProxy.AProxy(new Dog()).sleep();
        AnimalProxy.AProxy(new Cat()).sleep();
        AnimalProxy.AProxy(new Cat()).eat();


    }

}
