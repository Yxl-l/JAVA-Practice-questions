package com.yxl.Multithreaded.demo04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Text {
    private  static int count=1;
    private static final Lock lock = new ReentrantLock();
    static Random r = new Random();
    static int sum1=0;static int sum2=0;
    public static void twoColorBalls() {

        if (count<=100) {
            ArrayList <Integer> list = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                int a=r.nextInt(1,34);
               if (list.contains(a)){
                   i--;
               }else {
                   list.add(a);
               }
            }
            list.add(r.nextInt(1,17));
            System.out.println("编号为：" + (count++) + "的员工从" + Thread.currentThread().getName() +
                    "门入场，拿到的球码是：" + list);
            if (Thread.currentThread().getName().equals("一号门")){
                sum1++;
            }else {
                sum2++;
            }


        }

    }
    public static void main(String[] args) {
      Thread t1 = new Thread(() ->{while(count<=100){
          twoColorBalls();
      }},"一号门");

      Thread t2 = new Thread(() -> {while(count<=100){
              twoColorBalls();
      }},"二号门");

      t1.start();
      t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum1+"."+sum2);


    }
}
