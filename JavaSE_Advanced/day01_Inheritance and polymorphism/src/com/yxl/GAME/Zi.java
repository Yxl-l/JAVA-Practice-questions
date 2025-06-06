package com.yxl.GAME;

public class Zi extends Fu{
    int age;
    public Zi (){
        System.out.println("子类空参构造器执行了");
    }
    public Zi(String name,int age){
        super(name);
        this.age=age;
        System.out.println("子类有参构造器执行了");
    }
}
