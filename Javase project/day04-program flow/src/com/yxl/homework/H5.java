package com.yxl.homework;

public class H5 {
    public static void main(String[] args) {
        int sum=0,num=0;
        for (int i = 1000; i < 10000; i++) {
            if(i%10+i/1000==i/10%10+i/100%10){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("有"+num+"个");
    }
}
