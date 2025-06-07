package com.yxl.HomeWord;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个四位数：");
        int a= sc.nextInt();
        System.out.println(a%10+a/10%10+a/100%10+a/1000);

    }
}
