package com.yxl.HomeWord;

import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入销售额：");
        int x=sc.nextInt();
        System.out.println(x>=100000 ? "奖金为"+x*0.1 : "奖金为"+x*0.05);
    }
}
