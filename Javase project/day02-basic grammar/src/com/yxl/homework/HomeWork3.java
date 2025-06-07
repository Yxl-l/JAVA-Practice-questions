package com.yxl.homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a+b)/2.0;
        System.out.println("平均值为："+c);

    }
}
