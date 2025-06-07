package com.yxl.demo01;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
            System.out.println("第"+(++i)+"次执行");


        }
        return sum;
    }
}
