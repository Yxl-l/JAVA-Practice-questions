package com.yxl.demo02;

public class Text {
    public static void main(String[] args) {
            Account account = new Account("no001",10000);
           Thread t1=new DrawThread("小明取钱",account);
            Thread t2= new DrawThread("小红取钱",account);
            t1.start();
            t2.start();

    }
}
