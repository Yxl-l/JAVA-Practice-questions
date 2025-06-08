package com.yxl.demo01;

public class Test1 {

    /***
     * new->Runnable->Blocked->Runnable
     *  获取锁对象
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        //0、被加锁的对象
        Object lock = new Object();

        //1、创建第1个线程  t1
        Thread t1=new Thread(() -> {
            //4、在t1的run方法中获取一个对象的锁 synchronized (加锁对象)
            synchronized (lock){//如果无法获取锁，就变成Blocked阻塞状态
                System.out.println("t1获取锁后的状态是："+Thread.currentThread().getState());
            }
        });
        //3、创建一个t2线程，先获取synchronized (加锁对象)
        Thread t2 = new Thread(() -> {
            //对lock加锁,如果加锁成功，t1无法加锁->Blocked状态
            synchronized (lock){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //结束后，释放锁
                System.out.println("t2 释放锁！");
            }
        });

        //启动t2
        t2.start();                // t2启动->Runnable->run()->获取lock的锁->睡觉2秒

        //2、启动t1线程->Runnable状态
        Thread.sleep(200);   // 休眠200毫秒
        t1.start();               //  启动t1->Runnable状态->run( 获取lock的锁[获取不到->Blocked] )->1800毫秒
                                  //                                                            t2释放锁
                                  //                                                              t1获取锁->t1->Runnable
        Thread.sleep(200);
        System.out.println("t1此时状态是："+t1.getState()); //Runnable || Blocked
    }
}
