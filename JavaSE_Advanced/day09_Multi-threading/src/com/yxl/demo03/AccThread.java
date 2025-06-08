package com.yxl.demo03;

public class AccThread extends Thread{
    Acc acc;

    public AccThread(String name, Acc acc) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run (){
        acc.withdrawMoney(10000);
    }
}
