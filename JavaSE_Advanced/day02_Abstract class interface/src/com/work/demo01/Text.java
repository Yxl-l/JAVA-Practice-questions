package com.work.demo01;

public class Text {
    public static void main(String[] args) {
        AirConditioning airConditioning = new AirConditioning();
        airConditioning.setName("空调");
        airConditioning.setState(false);
        Remote.remote_ON(airConditioning);
        System.out.println(airConditioning);
        Remote.remote_OFF(airConditioning);
        System.out.println(airConditioning);

        Tv tv = new Tv();
        tv.setName("电视");
        tv.setState(false);
        System.out.println(tv);
        Remote.remote_ON(tv);
        System.out.println(tv);
    }
}
