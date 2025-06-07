package com.yxl.homework;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个大于100的三位整数：");
        int a=sc.nextInt();
        int i=100,num=0,sum=0;
        while (i<=a){
            if (i%10!=7&&i/10%10!=5&&i/100!=3){
                System.out.println(i);
                num++;
                sum+=i;
            }
            i++;
        }
        System.out.println("有"+num+"个，总和为"+sum);
    }
}
