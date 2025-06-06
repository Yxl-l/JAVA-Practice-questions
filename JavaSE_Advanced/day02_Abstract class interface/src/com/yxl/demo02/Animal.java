package com.yxl.demo02;

public abstract class Animal {
    String name;
    public abstract void eat();
    public abstract void sleep();
    public void run (){
        System.out.println("跑向主人");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
