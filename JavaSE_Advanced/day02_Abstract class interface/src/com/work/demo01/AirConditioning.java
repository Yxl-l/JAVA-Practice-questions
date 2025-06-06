package com.work.demo01;

/**
 * 空调
 */
public class AirConditioning extends Appliances implements State{


    @Override
    public void ON() {
        setState(true);
        System.out.println("打开空调");
    }

    @Override
    public void OFF() {
        setState(false);
        System.out.println("关闭空调");
    }
}
