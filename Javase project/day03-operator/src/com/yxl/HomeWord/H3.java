package com.yxl.HomeWord;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=sc.nextInt();
        int b=a*a,c=++a;
        System.out.println(b+"\t"+c);
    }
}
