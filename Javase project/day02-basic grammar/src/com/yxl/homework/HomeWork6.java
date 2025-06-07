package com.yxl.homework;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输给小明左右手各一张牌：");
        String brand1= sc.next();
        String brand2= sc.next();
        System.out.println("小明左手牌："+brand1+"\n"+"小明右手牌："+brand2);
        System.out.println("左右手交换后"+"\n"+"小明左手牌："+brand2+"\n"+"小明右手牌："+brand1);
    }
}
