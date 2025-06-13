package com.yxl.homework2.Junit;

public class StringUtil {
    public static void printNumber(String name){
        if(name == null){
            System.out.println("参数为null！请注意");
            return;
        }
        System.out.println("名字长度是：" + name.length());
    }
}
