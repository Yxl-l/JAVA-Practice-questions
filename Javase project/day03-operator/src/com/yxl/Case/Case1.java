package com.yxl.Case;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数");
        double b = sc.nextDouble();
        System.out.println("两个数中较大的是"+ (a>=b ? a:b)+"\n"+"较小的是"+(a<b ? a:b));
    }
}
