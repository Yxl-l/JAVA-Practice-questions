package com.yxl.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text1 {
    public static void main(String[] args) {
        System.out.println("==程序开始。。。。==");
        // 运行时异常的特点：编译阶段不报错，运行时出现的异常，继承自 RuntimeException。
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
//        System.out.println("==程序结束。。。。==");
        show2();


    }
    public static void show2()  {//throws Exception 向上抛出异常
        System.out.println("==程序开始。。。。==");
        // 编译异常：编译阶段报错，编译不通过。
        String str = "2024-07-09 11:12:13";
        // 把字符串时间解析成Java中的一个日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = null; // 编译时异常，提醒程序员这里的程序很容易出错，请您注意！
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {

        }
        System.out.println(date);
        System.out.println("==程序结束。。。。==");
    }
}
