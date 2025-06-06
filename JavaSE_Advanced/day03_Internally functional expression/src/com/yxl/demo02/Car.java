package com.yxl.demo02;

public class Car {
   private int a=10;


    public static class English{



       // System.out.println(a);不能访问实列成员，只能访问静态成员
        public  void show1(Car car){
            System.out.println(car.a);


        }
    }
}
