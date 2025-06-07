package com.yxl.classroom;

import java.util.Scanner;

public class JiSuanQi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        double num=sc.nextInt();
        System.out.println("请输入数字：");
        double num2=sc.nextInt();
        System.out.println("请输入运算符：");
        String op=sc.next();
        System.out.println(jiSuan(num,num2,op));
    }
    public static double jiSuan(double num,double num2,String op){
        switch (op){
            case "+":
                return num+num2;
            case "-":
                return num-num2;
            case "*":
                return num*num2;
            case "/":
                return num/num2;
            default:
                return 0;
        }
    }
}
