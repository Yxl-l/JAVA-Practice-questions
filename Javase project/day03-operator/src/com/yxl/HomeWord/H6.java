package com.yxl.HomeWord;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println((year%4==0 && year%100!=0||year%400==0) ? "闰年" :  "平年");
    }
}
