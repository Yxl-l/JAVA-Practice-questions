package com.yxl.demo02;

public class Text2 {
    public static void main(String[] args) {
        int a=1;
        System.out.println( monkey(a));
    }

    private static int monkey(int a) {
        if(a==10){
            return 1;
        }
        return 2*monkey(a+1)+2;
    }
}
