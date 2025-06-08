package com.yxl.demo05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalProxy {
    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    public static Animal AProxy(Animal animal){

        return (Animal) Proxy.newProxyInstance(
                AnimalProxy.class.getClassLoader(),
                animal.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("加辣椒");

                    return method.invoke(animal,args);
                }
        );
    }
}
