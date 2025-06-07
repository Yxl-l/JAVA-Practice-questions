package com.yxl.constructor;

public class Code7 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor  c2 = new Constructor(20,"张三");
        System.out.println(c2.getName());
        System.out.println(c2.getAge());
        System.out.println(c2);
    }
}
