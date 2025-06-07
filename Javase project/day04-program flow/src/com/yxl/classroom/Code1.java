package com.yxl.classroom;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入今天周几(如：周一）：");
        String week = sc.next();
        switch (week){
            case "周一":
//                System.out.println("去教室上课");
//                break;
            case "周二":
//                System.out.println("去教室上课");
//                break;
            case "周三":
//                System.out.println("去教室上课");
//                break;
            case "周四":
//                System.out.println("去教室上课");
//                break;
            case "周五":
                System.out.println("去教室上课");
                break;
            case "周六":
                System.out.println("今天是周六，去教室上课");
                break;
            case "周日":
                System.out.println("今天是周日，去教室上课");
                break;
                default:
                    System.out.println("输入有误");
        }

    }
}
