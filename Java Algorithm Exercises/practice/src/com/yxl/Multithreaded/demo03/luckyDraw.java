package com.yxl.Multithreaded.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class luckyDraw {
    private static final List <String> prize = new ArrayList<>();
    private static int sum;
    private static final Lock lock = new ReentrantLock();

    private static void sweepstakes(){
        lock.lock();
        if (sum>0) {
            Random random = new Random();
            int a = random.nextInt(prize.size());//抽出一个索引
            System.out.println(Thread.currentThread().getName() + "抽出了：" + prize.get(a));
            prize.remove(a);
            sum = prize.size();
        }
        lock.unlock();
    }
    public static void main(String[] args) {
        Collections.addAll(prize,
                "迪拜7日游","苹果手机","小米空气净化器","苹果笔记本","格力空调",
                "海信电视","联想电脑","华为手机","海尔冰箱","三洋踏板摩托");
         sum = prize.size();

        Thread t1 = new Thread(() -> {
            while (sum>0) {
                sweepstakes();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }},"第一组");

        Thread t2 = new Thread(() -> {
            while (sum>0){
                sweepstakes();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"第二组");

        t1.start();
        t2.start();

    }
}
