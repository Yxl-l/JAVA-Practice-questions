package com.yxl.demo02;

public class Account {
    private String cardid;
    private  double money;


    public   void drawMoney(double money){
        String name=Thread.currentThread().getName();
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + this.cardid + "当前余额" + this.money);
                this.money -= money;
                System.out.println(name + this.cardid + "扣款" + money + "后余额：=" + this.money);

            } else {
                System.out.println(name + this.cardid + "余额不足" + this.money);
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardid='" + cardid + '\'' +
                ", money=" + money +
                '}';
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(String cardid, double money) {
        this.cardid = cardid;
        this.money = money;
    }
}
