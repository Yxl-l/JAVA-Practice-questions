package com.yxl.demo07;

public class AnimalProxy implements Animal{
    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        System.out.println("很饿要多吃点");
        animal.eat();
    }

    @Override
    public void sleep() {
        System.out.println("困的不行了了");
        animal.sleep();

    }
}
