package com.yxl.demo02;

public class Text {
    public static void main(String[] args) {
        int a=5,b=0,c=0;//初始5瓶没喝的，0空瓶，0盖子；
        System.out.println("一共喝了"+coke(a,b,c)+"瓶");
        System.out.println("一瓶都换不了了");
    }

    private static int coke(int a, int b, int c) {
        int sum =a;//有a瓶可以喝
        b=b+a;
        c=c+a;
        a=b/4+c/2;
        b=b%4;
        c=c%2;
        if (a==0){

            System.out.println("还剩盖子"+b);
            System.out.println("还剩瓶子"+c);
            return sum;
        }
        return sum+coke(a, b, c);
    }
}
