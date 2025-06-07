package com.yxl.homework;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个小数：");
        double  a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("两个数的和为："+(a+b));
        System.out.println("两个数的差为："+(a-b));
        System.out.println("两个数的商为："+a/b);
        System.out.println("两个数的积为："+a*b);
    }
}
