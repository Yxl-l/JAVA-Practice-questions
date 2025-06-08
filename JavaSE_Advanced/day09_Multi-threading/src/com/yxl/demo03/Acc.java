package com.yxl.demo03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Acc {
    private String cardId;
    private double money;
    private final Lock lock = new ReentrantLock();

    public void withdrawMoney(double money){
        String name = Thread.currentThread().getName();
        lock.lock();
        if (this.money>=money){
            System.out.println(name+"余额"+this.money+"取款"+money);
            this.money-=money;
            System.out.println(name+"取款后余额"+this.money);
        }else {
            System.out.println(name+"余额不足不能取钱");
        }
        lock.unlock();
    }
    @Override
    public String toString() {
        return "Acc{" +
                "cardId='" + cardId + '\'' +
                ", money=" + money +
                '}';
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Acc(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
}
