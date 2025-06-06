package com.homework.demo05;

public class Text {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Zoo.makeAnimalSound(cat);
        ((Cat) cat).eat();
        Animal dog = new Dog();
        Zoo.makeAnimalSound(dog);
        ((Dog)dog).run();
//        ((Dog)cat).run();//转化类型应与new类型一样
        Animal animal = new Dog();
        if( animal instanceof Cat){
            Cat cat1 = (Cat)animal;
        }else{
            System.out.println("真实对象不是Cat，不能进行类型转换!");
        }

    }
}
