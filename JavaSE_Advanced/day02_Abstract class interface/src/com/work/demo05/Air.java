package com.work.demo05;

/**
 * 空调
 */
public class Air extends HomeAppliances{
    public Air(int id, String name, String location, boolean status) {
        super(id, name, location, status);
    }

    @Override
    public void work() {
        System.out.println("空调启动了");
    }
}
