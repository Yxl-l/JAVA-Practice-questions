package com.yxl.Case;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int a=sc.nextInt();
        if (a<60){
            System.out.println("挨打");
        }
        else if (a>=60&&a<80){
            System.out.println("没奖励");
        }
        else if (a>=80&&a<=100){
            System.out.println("出去玩");
        }
        else {
            System.out.println("输入有误");
        }
    }
}
