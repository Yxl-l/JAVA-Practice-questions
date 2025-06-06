package com.yxl.demo01;

public class Code1 extends Pas{
    private int value;
    int age;
    String name;
    public void setValue(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    protected void eat1() {
        System.out.println("吃火鸡面");
    }

    @Override
    public String toString() {
        return "value"+value+"age"+age+"name"+name;
    }
}
