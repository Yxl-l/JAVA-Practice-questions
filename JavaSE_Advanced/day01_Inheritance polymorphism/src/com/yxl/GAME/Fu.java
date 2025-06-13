package com.yxl.GAME;

public class Fu {
    String name;
    public Fu (){
        System.out.println("父类空参构造器执行了");
    }
    public Fu(String name){
        this.name=name;
        System.out.println("父类有参构造器执行了");
    }
}
