package com.yxl.dome04;

public class Zi extends Fu{
    int age;
    int id;
    public Zi (int age,int id){
        this. age=age;
        this.id=id;

    }
    public Zi (int id){
        this(10,id);
    }
    public Zi (String name ,int id,int age){
        super(name);
        this.id=id;
        this.age=age;

    }

}
