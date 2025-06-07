package com.yxl.HomeWord;

import java.util.Scanner;

public class H7 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入多少秒：");
        int time = sc.nextInt();
        int a=time%60;
        int b=time/60;
        int c=b%60;
        int d=b/60;
        System.out.println(d+"小时"+c+"分"+a+"秒");
    }
}
