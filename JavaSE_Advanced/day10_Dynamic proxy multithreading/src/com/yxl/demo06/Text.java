package com.yxl.demo06;

public class Text {
    public static void main(String[] args) {
        Star s1 = StarProxy.SProxy(new BigStar());
        s1.sing();
        s1.dance();
    }
}
