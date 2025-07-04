package com.yxl.utils;

import com.yxl.pojo.EmpLogin;
import com.yxl.pojo.OperateLog;

public class CurrentHolder {
            //创建一个ThreadLocal在线程中存储ID
    private static final ThreadLocal<Integer> CURRENT_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<EmpLogin> CURRENT_LOGIN = new ThreadLocal<>();
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
    //添加
    public static void setEmpLogin(EmpLogin empLogin) {
        CURRENT_LOGIN.set(empLogin);
    }
    //获取ThreadLocal
    public static EmpLogin getEmpLogin() {
        return CURRENT_LOGIN.get();
    }
    //删除ThreadLocal
    public static void removeEmpLogin() {
        CURRENT_LOGIN.remove();
    }
}