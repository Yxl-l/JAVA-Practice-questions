package com.yxl.operator;

import java.util.Scanner;

public class QiuHe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num=sc.nextInt();
        int a=num%10;
        int b=(num/10)%10;
        int c=num/100;
        System.out.println("各位数之和："+(a+b+c));

    }
}
