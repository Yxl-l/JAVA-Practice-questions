package com.yxl.classroom;

public class Code4 {
    public static void main(String[] args) {
        int sum = 0, num = 0;
        for (int i = 100; i < 1000; i++) {
            sum = (i % 10) * (i % 10) * (i % 10) + (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10) + (i / 100) * (i / 100) * (i / 100);
            if (sum == i) {
                num++;
                System.out.println(i);
            }
        }
        System.out.println("水仙花个数有" + num + "个");
    }
}
