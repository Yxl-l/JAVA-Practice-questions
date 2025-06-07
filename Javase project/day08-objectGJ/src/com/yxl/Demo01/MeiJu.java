package com.yxl.Demo01;

public class MeiJu {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s.getName());
        Season  s2 = Season.AUTUMN;
        s2.setName("秋天1111");
        System.out.println(s2.getName());

        Season [] arr = Season.values();
        for (Season s3 : arr) {
            System.out.println(s3.name());
        }
    }
}
