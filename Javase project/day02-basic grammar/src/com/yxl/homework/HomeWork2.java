package com.yxl.homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double a=sc.nextDouble();
        int b=(int) Math.round(a);//Math.round()四舍五入
        System.out.println("整数部分四舍五入为："+b);
    }
}
