package com.yxl.homework;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.nextLine();
        sumEE(s);
    }
/*
Java中的next、nextLine、nextlnt等方法的区别
·next()用来读取字符串，但是遇到分隔符（如空格、换行符、制表符）会停止。
nextLine(读取整行的输入，包含空格以及制表符，到换行符为止。
nextlnt()性质上和next()是一样的，区别就是nextlnt(只能用来读取int类的数字。
还有nextDouble()等等方法和nextlnt(都是类似的。*/

    public static void sumEE(String s) {
        char[]arr=s.toCharArray();
        int a=0,b=0,c=0,d=0;
        for (int i = 0; i < arr.length; i++){
            if ((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z')){
                a++;
            }else if (arr[i]>='0' && arr[i]<='9'){
                b++;
            }else if (arr[i]==' '){
                c++;
            }else {
                d++;
            }
        }
        System.out.println("字母："+a+"数字："+b+"空格："+c+"其他："+d);

    }
}
