package com.yxl.Multithreaded.demo05;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterNumTask implements Runnable {
    private static  int num=1;
    private static  int i=0;
    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        while (i<52) {
            System.out.print(" " + num++);
            i++;
        }
        lock.unlock();
    }
}
