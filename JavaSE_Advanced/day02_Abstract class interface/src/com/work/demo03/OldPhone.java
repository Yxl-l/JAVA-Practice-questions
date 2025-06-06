package com.work.demo03;

public class OldPhone extends Phone implements IPlay{
    @Override
    public void game() {
        System.out.println("旧手机不能玩游戏");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sms() {
        System.out.println("发短信");
    }
}
