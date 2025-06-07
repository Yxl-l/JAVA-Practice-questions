package com.yxl.homework;

public class H3 {
    public static void main(String[] args) {
        year(2021);
    }

    public static void year(int n) {
        if (n%4==0&&n%100!=0||n%400==0){
            System.out.println(n+"年是闰年");
        }
        else {
            System.out.println(n+"年不是闰年");
        }

    }
}
