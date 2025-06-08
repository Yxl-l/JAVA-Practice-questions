package com.yxl.demo02;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;

        }
        return Thread.currentThread().getState()+ "求和是"+sum;
    }
}
