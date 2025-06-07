package com.yxl.Case;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Mov [] movs = new Mov[5];
        movs[0] = new Mov("《战狼1》",9.2);
        System.out.println(movs[0]);
        movs[1]= new Mov("《战狼2》",9.5);
        System.out.println(movs[1]);
        movs[2]= new Mov("《战狼3》",9.8);
        System.out.println(movs[2]);
        movs[3]= new Mov("《战狼4》",10.0);
        System.out.println(movs[3]);
        movs[4]= new Mov("《战狼5》",99.0);
        System.out.println(movs[4]);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影：");
        String idM = sc.next();
        for (int i = 0; i < movs.length; i++)
        //equals()比较字符串是否相同，如果相同返回true，不相同返回false
        {
            if (idM.equals(movs[i].getName()))
            {
                System.out.println("该电影评分为："+movs[i].getScore());
                return;
            }
            if (i==movs.length-1)
            {
                System.out.println("没有该电影");
            }
        }

    }
}
