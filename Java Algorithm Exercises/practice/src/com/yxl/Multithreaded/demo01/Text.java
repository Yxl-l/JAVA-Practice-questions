package com.yxl.Multithreaded.demo01;

public class Text {
    public static void main(String[] args) {
        Account account = new Account("A001",1000);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <10 ; i++) {
                account.saveMoney(100);
            }

        },"小王");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <10 ; i++) {
                account.saveMoney(100);
            }
        },"蔡徐坤");

        t1.start();
        t2.start();



    }

}
