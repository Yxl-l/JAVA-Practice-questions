package com.yxl.Case;

public class Dishes {
    private String name;
    private double price;
    private String introduce;

    public Dishes(String name, double price, String introduce) {
        this.name = name;
        this.price = price;
        this.introduce = introduce;
    }

    public Dishes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
