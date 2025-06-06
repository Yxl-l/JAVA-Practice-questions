package com.work.demo02;

public class Round implements Shape{
    public static final double PI =3.14;
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("面积是"+PI*r*r);


    }

    @Override
    public void circumference() {
        System.out.println("周长是"+PI*r*2);
    }
}
