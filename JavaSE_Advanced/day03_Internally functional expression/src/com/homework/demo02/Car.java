package com.homework.demo02;

public class Car {
    int a=1;
    static int b=0;
    public class Engine{
        int a=2;
        public void show(){
            int a=3;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Car.this.a);
        }
    }
    public static class Ae{

        public void add (Car car ){
            System.out.println(car.a);
        }
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Car.b = b;
    }
}
