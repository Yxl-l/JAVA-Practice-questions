package com.work.demo01;

public class Tv extends Appliances implements State{
    @Override
    public void ON() {
        setState(true);
        System.out.println("打开电视");
    }

    @Override
    public void OFF() {
        setState(false);
        System.out.println("关闭电视");
    }
}
