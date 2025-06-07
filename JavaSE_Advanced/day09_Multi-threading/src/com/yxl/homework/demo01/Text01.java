package com.yxl.homework.demo01;

public class Text01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();



        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("蔡徐坤执行了");

            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName()+"厉不厉害你鸡哥");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });


        System.out.println(t1.getName());

        t2.start();
        t2.join();

        t1.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("鸡哥");


        }

    }
}
