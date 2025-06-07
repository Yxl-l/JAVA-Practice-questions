package com.yxl.operator;

public class LuoJi {
    public static void main(String[] args) {
        int a = 42;
        int b = 100;
        int c=60;
        System.out.println(a>b&c>a);//false
        System.out.println(a>b&c>b);//false
        System.out.println(a>b|c>b);//false
        System.out.println(a>b|!(c>b));//true
        System.out.println(a>b|b>c);//true
        System.out.println(a>b^b>c);//true  异或，相同为false不同为true
        System.out.println(a>b^b<c);//false
        System.out.println(a>b&&++b<c);//短路与，左边如果为false（只执行左边就得到结果了）则右边不执行
        System.out.println(b);
        System.out.println(a>b||++b<c);//短路或，左边如果为true（只执行左边就得到结果了）则右边不执行
        System.out.println(b);
        System.out.println(a<b||++b<c);//短路或，左边如果为true（只执行左边就得到结果了）则右边不执行
        System.out.println(b);

    }
}
