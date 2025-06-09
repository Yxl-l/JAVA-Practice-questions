package com.yxl.Multithreaded.demo05;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterCharTask implements Runnable {
   static char c = 'A';
    private static  int i=0;
    private static final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        while (i<24){
            System.out.print(" " + c++);
            i++;
        }

        lock.unlock();
    }
}
