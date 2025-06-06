package com.homework.dome03;

public abstract class People {
    public final void write(){//模板最好用final修饰
        System.out.println("胡桃桃");
        System.out.println("小芙芙");
        System.out.println("可爱菲");
        addWrite();
    }

     abstract void addWrite();

}
