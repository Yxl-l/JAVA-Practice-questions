package com.yxl.demo01;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        /****
         * NEW->start->Runnable
         */
        Thread t1 = new Thread(() -> {
            System.out.println("t1线程的run()方法在执行!");
        },"t1");

        //目前状态NEW状态
        System.out.println("t1 new()之后状态："+t1.getState());

        //调用t1的start()方法->Runnable
        t1.start();

        //打印状态
        System.out.println("t1 调用start()方法之后状态："+t1.getState());

        //等待程序执行完成，打印状态
        Thread.sleep(1000);
        System.out.println("t1 的状态："+t1.getState());

    }
}
