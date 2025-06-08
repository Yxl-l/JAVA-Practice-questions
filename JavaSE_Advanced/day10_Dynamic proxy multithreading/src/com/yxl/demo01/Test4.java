package com.yxl.demo01;

public class Test4 {

    public static void main(String[] args) {
        //创建锁对象
        Object lock = new Object();


        //创建t1线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("t1准备休眠！");
                    synchronized (lock){
                        lock.wait(3000);
                        System.out.println("休眠3秒后执行！");
                        System.out.println("t1的状态："+Thread.currentThread().getState());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();

    }
}
