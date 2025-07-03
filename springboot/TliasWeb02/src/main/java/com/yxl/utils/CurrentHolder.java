package com.yxl.utils;

/**
 * 记录当前登录员工ID到ThreadLocal里
 */
public class CurrentHolder {
    private static final ThreadLocal<Integer> CURRENT_LOCAL = new ThreadLocal<>();

    public static void setCurrentId(Integer id){
        CURRENT_LOCAL.set(id);
    }
    public static Integer getCurrentId(){
        return CURRENT_LOCAL.get();
    }
    public static void remove(){
        CURRENT_LOCAL.remove();
    }
}
