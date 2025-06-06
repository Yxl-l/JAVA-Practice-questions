package com.yxl.demo02;

public class Text4 {
    public static void main(String[] args) {
        int a=5,b=0,c=0;
        System.out.println("一共喝了"+drinkBeer(a,b,c));
    }

    private static int drinkBeer(int a, int b, int c) {
        int sum=a;//本轮能喝的瓶数
        b=b+a;//本轮瓶盖数
        c=c+a;//本轮瓶子数
        a=b/4+c/2;//本轮兑换数量
        b=b%4;//本轮瓶盖剩余
        c=c%2;//本轮瓶子剩余
        if (a==0){
            System.out.println("盖子剩余"+b);
            System.out.println("瓶子剩余"+c);
            System.out.println("不能再喝了");
            return sum;
        }
        return sum+drinkBeer(a, b, c);
    }
}
