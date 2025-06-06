package com.yxl.demo01;

public class Text02 {
    public static void main(String[] args) {
        Code1 c1=new Code1();
        c1.setValue(3);
        c1.age=3;
        c1.name="徐";
        c1.eat1();
        System.out.println(c1);
        Code2 c2=new Code2();
        c2.eat1();
    }
}
