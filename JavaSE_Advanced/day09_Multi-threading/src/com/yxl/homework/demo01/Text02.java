package com.yxl.homework.demo01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Text02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> f1=new FutureTask<Integer>(new MyCallable(10));
        Thread t1 = new Thread(f1);
        t1.start();
        System.out.println( f1.get());
    }
}
