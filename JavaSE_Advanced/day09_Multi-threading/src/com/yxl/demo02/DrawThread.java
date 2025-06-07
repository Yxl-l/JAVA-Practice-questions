package com.yxl.demo02;



public class DrawThread extends Thread {
    private Account account;

    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run(){
      account.drawMoney(10000);

    }


}
