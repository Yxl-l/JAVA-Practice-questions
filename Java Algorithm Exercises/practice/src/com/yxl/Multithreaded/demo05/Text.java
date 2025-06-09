package com.yxl.Multithreaded.demo05;

public class Text {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterCharTask());
        Thread t2 = new Thread(new PrinterCharTask());
        Thread t3 = new Thread(new PrinterNumTask());
        Thread t4 = new Thread(new PrinterNumTask());

        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
