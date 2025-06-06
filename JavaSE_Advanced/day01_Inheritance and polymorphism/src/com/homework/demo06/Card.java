package com.homework.demo06;

public class Card {
    private String cartId;
    private String name;
    private String phone;
    private double balance;

    public Card() {
    }
    public void consumption(double money,double balance){

    }
    public void go(double a){
        balance+=a;
        System.out.println("充值成功，余额为"+balance);
    }

    public Card(String cartId, String name, String phone, double balance) {
        this.cartId = cartId;
        this.name = name;
        this.phone = phone;
        this.balance = balance;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
