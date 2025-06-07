package com.yxl.homework;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入摄氏度：");
        double a=sc.nextDouble();
        System.out.println("对应的华氏度为："+(a*9/5+32));
    }
}
