package com.yxl.operator;

import java.util.Scanner;

public class SanYuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=sc.nextInt();
        System.out.println(a>=60 ? "通过" : "不通过" );
    }
}
