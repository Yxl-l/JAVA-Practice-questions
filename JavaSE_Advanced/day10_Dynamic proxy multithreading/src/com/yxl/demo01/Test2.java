package com.yxl.demo01;

public class Test2 {


    public static void main(String[] args) throws InterruptedException {
        // 创建对象
        Object lock = new Object();

        // 创建t1
        Thread t1 = new Thread(() -> {
            // 让t1获取对象锁
            synchronized (lock) {
                try {
                    System.out.println("t1的状态："+Thread.currentThread().getState());
                    // 获取对象锁调用了wait方法->Waiting状态
                    lock.wait();//会释放锁
                    System.out.println("t1的状态(调用wait后)："+Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //启动线程
        t1.start();

        //打印t1状态
        Thread.sleep(200);
        System.out.println("调用wait方法后，t1的状态："+t1.getState());

        //创建线程t2
        Thread t2 = new Thread(() -> {
            synchronized (lock){
                //唤醒指定线程
                lock.notify();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t2 释放锁！");
            }
        });

        t2.start();
    }
}
