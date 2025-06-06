package com.yxl.demo02;

public class Text01 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(  factorial(a));
    }

    private static int factorial(int a) {
        if(a==1){
            return 1;
        }
        return a*factorial(a-1);
    }


}
