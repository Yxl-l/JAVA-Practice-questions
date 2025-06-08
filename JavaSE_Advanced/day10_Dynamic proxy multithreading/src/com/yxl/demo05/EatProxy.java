package com.yxl.demo05;

public class EatProxy implements Animal {
    private Animal animal;

    public EatProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        System.out.println("多加点辣子");
        animal.eat();
    }

    @Override
    public void sleep() {
        System.out.println("多加点辣子");
        animal.sleep();

    }
}
