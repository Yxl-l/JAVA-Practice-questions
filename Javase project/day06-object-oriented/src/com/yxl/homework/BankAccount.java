package com.yxl.homework;

public class BankAccount {
    private String id;
    private double balance;
    static int totalAccounts=0;
    {

        totalAccounts++;

        if (totalAccounts<10){
            id="BA000"+totalAccounts;
        }else if (totalAccounts<100){
            id="BA00"+totalAccounts;
        }else if (totalAccounts<1000){
            id="BA0"+totalAccounts;
        }else {
            id="BA"+totalAccounts;
        }
    }
    public BankAccount( double balance) {

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public String getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("存款成功，当前余额为："+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("用户"+id+"取款成功，当前余额为："+balance);
        }else{
            System.out.println("用户"+id+"取款失败，当前余额不足");
        }
    }
}