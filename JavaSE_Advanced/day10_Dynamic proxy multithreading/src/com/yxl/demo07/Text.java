package com.yxl.demo07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Text {
    public static Animal AnimalProxyAA(Animal animal) {
        Animal proxy = (Animal) Proxy.newProxyInstance(
                Text.class.getClassLoader(),
                animal.getClass().getInterfaces(),
                (proxy1, method, args) -> {
                    if (method.getName().equals("eat")) {
                        System.out.println("很饿要多吃点");
                    } else {
                        System.out.println("困的不行了了");
                    }
                    return method.invoke(animal, args);
                }

        );
        return proxy;
    }
    public static void main(String[] args) {
        AnimalProxy animalProxy1 = new AnimalProxy(new Cat());
        AnimalProxy animalProxy2 = new AnimalProxy(new Dog());
        animalProxy1.eat();
        animalProxy1.sleep();
        animalProxy2.eat();
        animalProxy2.sleep();


        Animal catProxy = AnimalProxyAA(  new Cat());
        Animal dogProxy = AnimalProxyAA(new Dog());
        catProxy.sleep();
        catProxy.eat();
        dogProxy.sleep();
        dogProxy.eat();


    }
}
