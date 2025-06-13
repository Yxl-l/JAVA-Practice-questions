package com.yxl.demo01;

public class Phone {
    private String name;
    private double money;

    public Phone(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
