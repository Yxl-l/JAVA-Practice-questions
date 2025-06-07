package com.yxl.debug;

import java.util.Scanner;

public class Scanner12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int q = sc.nextInt();
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        System.out.println("请输入小数：");
        double v = sc.nextDouble();
        System.out.println("你输入的整数是：" + q);
        System.out.println("你输入的字符串是：" + s);
        System.out.println("你输入的小数是：" + v);
    }
}
