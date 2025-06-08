package com.yxl.demo01;

public class Text01 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();//创建要加🔒的对象

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                System.out.println("成功对lock加锁后进程t1状态为"+Thread.currentThread().getState());
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock){
                System.out.println("t2先拿到lock加锁对象然后休眠1秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();
        t1.start();Thread.sleep(500);
        System.out.println("这时t1状态"+t1.getState());
        System.out.println("这时t2状态"+t2.getState());
        Thread.sleep(1000);//等待1秒后t2释锁
        System.out.println("一秒后t1状态"+t1.getState());


    }
}
