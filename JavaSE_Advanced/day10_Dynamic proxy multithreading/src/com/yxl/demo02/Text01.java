package com.yxl.demo02;

import java.io.File;
import java.util.concurrent.*;

public class Text01 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = new ThreadPoolExecutor(
                3,//主线程数量
                5,//最大线程数量
                10,//临时线程存活时间
                TimeUnit.SECONDS,//存活时间单位
                new ArrayBlockingQueue<>(3),//指定任务队列（最大容量）
               Executors.defaultThreadFactory(), //指定现场池工厂
                new ThreadPoolExecutor.CallerRunsPolicy()//拒绝策略
        );
        pool.execute(() -> System.out.println("Runnable任务执行了"));
        Future<String> f1 = pool.submit(new MyCallable(10));
        System.out.println(f1.get());


    }
}
