package com.yxl.HomeWord;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println(a%2==0 && a>=10 ? "符合要求" : "不符合");
    }
}
