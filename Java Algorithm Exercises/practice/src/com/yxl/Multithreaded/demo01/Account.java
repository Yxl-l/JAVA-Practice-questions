package com.yxl.Multithreaded.demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *模拟一个简单的银行系统，使用两个不同的线程向同一个账户存钱。
 *账户的初始余额是1000元，两个线程每次存储100元，分别各存储1000元，不允许出现错误数据。
 */
public class Account {
    private String cardId;
    private double money;
    private final Lock lock = new ReentrantLock();
    public void saveMoney (double money){
        lock.lock();
        this.money+=money;
        System.out.println(Thread.currentThread().getName()+"存入账户"+cardId+money+"元，账户余额："+this.money);
        lock.unlock();
    }

    @Override
    public String toString() {
        return "Account{" +
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

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
}
