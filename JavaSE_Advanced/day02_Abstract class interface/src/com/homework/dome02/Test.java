package com.homework.dome02;

public class Test {
    public static void Zom(Animal animal){
        animal.run();
        animal.eat();
        animal.seep();
    }
    public static void main(String[] args) {
        Animal cat = new Cat();
        Zom(cat);
        Animal dog = new Dog();
        Zom(dog);
    }
}
