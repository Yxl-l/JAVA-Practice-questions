package com.yxl.homework.demo01;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("蔡徐坤");

        }
    }
}
