package com.yxl.classroom;

import java.util.Random;
import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random  r=new Random();
        int num=r.nextInt(1,100 );
        while (true){
            System.out.println("请输入一个数(1-100)之间");
            int num2=sc.nextInt();
            if (num2>num){
                System.out.println("猜大了");
            }
            else if (num2<num){
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
