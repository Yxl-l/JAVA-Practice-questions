package com.yxl.demo02;

import java.util.Random;
import java.util.concurrent.*;

public class Text02 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = new ThreadPoolExecutor(
                3,//主线程数量
                5,//最大线程数量
                10,//临时线程存活时间
                TimeUnit.SECONDS,//存活时间单位
                new ArrayBlockingQueue<>(3),//指定任务队列（最大容量）
                Executors.defaultThreadFactory(), //指定现场池工厂
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略默认这个，队列满了后抛出异常丢弃超出任务
        );
        Runnable runnable = () -> {
            System.out.println("Runnable任务执行了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);


    }
}
