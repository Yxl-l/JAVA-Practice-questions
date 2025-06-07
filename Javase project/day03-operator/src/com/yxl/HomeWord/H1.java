package com.yxl.HomeWord;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        System.out.println(sc.nextInt()>=60 ? "及格" : "不及格");
    }
}
