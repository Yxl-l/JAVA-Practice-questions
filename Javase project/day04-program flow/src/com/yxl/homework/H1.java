package com.yxl.homework;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        double num1 = sc.nextDouble();
        System.out.println("请输入数字：");
        double num2 = sc.nextDouble();
        System.out.println("请输入数字：");
        double num3 = sc.nextDouble();
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("最大值是"+num1);
            }
           else {
               System.out.println("最大值是"+num3);
           }

        }
        else if(num2>num1){
            if (num2>num3){
                System.out.println("最大值是"+num2);
            }
            else {
                System.out.println("最大值是"+num3);
            }
        }
    }
}
