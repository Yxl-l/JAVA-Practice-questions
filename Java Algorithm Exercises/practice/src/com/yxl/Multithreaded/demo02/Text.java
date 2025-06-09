package com.yxl.Multithreaded.demo02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 小明上课时打瞌睡，被老师发现,老师惩罚他抄写100遍单词"He1loWorld",而且老师每发现一个同学,惩罚的次数和抄写的内容都不一样。恰好今天学习多线程，于是乎小明就找到了小王帮助他一起抄写单词。请使用多线程模拟小明和小王一起完成抄单词的惩罚。
 */
public class Text {
    private static  int a =100;
    private static  int sum1 =0;
    private static  int sum2=0;
    private static final Lock lock = new ReentrantLock();

    public  static void transcribe (){
        lock.lock();
        try {
            if (a > 0) {
                System.out.println(Thread.currentThread().getName() + "抄写一边，两人一共还需" + (--a) + "遍");
                // 根据当前线程更新 sum1 或 sum2
                if (Thread.currentThread().getName().equals("蔡徐坤")) {
                    sum1++;
                } else {
                    sum2++;
                }
            }
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {while (a>0){transcribe();
        }

        },"蔡徐坤");
        Thread t2 = new Thread(() -> {while (a>0){transcribe();} },"鸡哥🏀");
        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println("蔡徐坤抄了"+sum1);
        System.out.println("鸡哥🏀抄了"+sum2);




    }
}
