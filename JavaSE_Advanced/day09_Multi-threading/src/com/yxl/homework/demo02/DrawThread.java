package com.yxl.homework.demo02;


public class DrawThread extends Thread {
    Account account ;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
   public void run(){
        account.withdrawMoney(10000);
    }


}
