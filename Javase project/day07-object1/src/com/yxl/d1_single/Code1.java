package com.yxl.d1_single;

public class Code1 {
    public static void main(String[] args) {
        A a1=A.getInstance();
        System.out.println(a1);
        A a3=A.getInstance();
        System.out.println(a3);

        B b1=B.getInstance();
        System.out.println(b1);
    }
}
