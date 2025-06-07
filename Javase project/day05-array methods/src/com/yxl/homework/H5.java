package com.yxl.homework;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入英文字符串");
        String s=sc.next();
        System.out.println("大写字母个数："+sumE(s));
    }

    public static int sumE(String s) {
        char [] arr=s.toCharArray();
        int cont=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>='A' && arr[i]<='Z'){
                cont++;
            }
        }
        return cont;
    }
}
