package com.yxl.homework.demo02;

public class Text {
    public static void main(String[] args) {
        Account account = new Account("no0001A",10000);
        Thread t1 = new DrawThread("蔡徐坤取钱",account);
        Thread t2 = new DrawThread("吴亦凡取钱",account);
        t1.start();
        t2.start();

    }
}
