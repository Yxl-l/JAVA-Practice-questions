package com.yxl.utils;

public class CurrentHolder {
            //创建一个ThreadLocal在线程中存储ID
    private static final ThreadLocal<Integer> CURRENT_LOCAL = new ThreadLocal<>();
//添加
    public static void setCurrentId(Integer employeeId) {
        CURRENT_LOCAL.set(employeeId);
    }
//获取ThreadLocal
    public static Integer getCurrentId() {
        return CURRENT_LOCAL.get();
    }
//删除ThreadLocal
    public static void remove() {
        CURRENT_LOCAL.remove();
    }
}