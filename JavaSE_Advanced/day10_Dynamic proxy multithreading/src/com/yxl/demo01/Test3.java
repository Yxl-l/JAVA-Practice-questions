package com.yxl.demo01;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        //创建对象，用于加锁
        Object lock = new Object();

        //1、sleep(时间)
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (lock){
                        //休眠3秒钟
                        System.out.println("t1加锁休眠前的状态是:"+Thread.currentThread().getState());
                        Thread.sleep(3000);
                        System.out.println("t1加锁休眠后醒了的状态是:"+Thread.currentThread().getState());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();

        //打印t1的状态
        Thread.sleep(200);
        System.out.println("t1休眠后的状态是："+t1.getState());

        //创建线程2 ，获取锁,3秒以内获取不到
        Thread t2 = new Thread(() -> {
            synchronized (lock){
                System.out.println("t2获取了锁，并执行了！");
            }
        });
        t2.start();

    }
}
