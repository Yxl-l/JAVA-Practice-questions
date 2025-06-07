package com.yxl.d1_single;

public class A {
    private A() {
    }
    public static A a=new A();
    public static A getInstance() {
        return a ;
    }
}
