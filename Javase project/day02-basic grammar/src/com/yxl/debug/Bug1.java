package com.yxl.debug;

public class Bug1 {
    public static void main(String[] args) {

        double a = 10;
        System.out.println(a);

        a+=0.1;
        System.out.println(a);
        a+=0.1;
        System.out.println(a);
        a+=0.1;
        System.out.println(a);
        System.out.println(0.2+0.1);
    }
}
