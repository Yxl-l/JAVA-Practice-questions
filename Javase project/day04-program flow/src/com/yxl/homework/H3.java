package com.yxl.homework;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年数和金额：");
        int year = sc.nextInt(), money = sc.nextInt();
        if (year >= 1 && year < 3) {
            System.out.println("您目前工作" + year + "年，您的基本工资为：" + money + "元" + "应涨工资3000元" + "总工资为：" + (money + 3000));
        } else if (year >= 3 && year < 5) {
            System.out.println("您目前工作" + year + "年，您的基本工资为：" + money + "元" + "应涨工资5000元" + "总工资为：" + (money + 5000));
        } else if (year>=5 && year<10) {
            System.out.println("您目前工作" + year + "年，您的基本工资为：" + money + "元" + "应涨工资10000元" + "总工资为：" + (money + 10000));
        }
        else if (year>=10 && year<15) {
            System.out.println("您目前工作" + year + "年，您的基本工资为：" + money + "元" + "应涨工资20000元" + "总工资为：" + (money + 20000));
        }
        else {
            System.out.println("您的工龄不满足条件");
        }
    }
}
