package com.yxl.classroom;

public class Coed7 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }

    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }

}
