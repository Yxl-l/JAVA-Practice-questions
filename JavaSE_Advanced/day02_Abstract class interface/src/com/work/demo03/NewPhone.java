package com.work.demo03;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void game() {
        System.out.println("新手机可以打游戏");
    }

    @Override
    public void call() {
        System.out.println("打电话视频通话");
    }

    @Override
    public void sms() {
        System.out.println("短信可以附带图片");

    }
}
