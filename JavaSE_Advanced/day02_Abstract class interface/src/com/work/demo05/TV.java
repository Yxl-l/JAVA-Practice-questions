package com.work.demo05;

public class TV extends HomeAppliances{
    public TV(int id, String name, String location, boolean status) {
        super(id, name, location, status);
    }

    @Override
    public void work() {
        System.out.println("电视启动了");
    }
}
