//package com.exam.Utils;
//
//
//import java.util.List;
//
//public class CurrentHolder {
//            //创建一个ThreadLocal在线程中存储当前登录用户的权限集合
//    private static final ThreadLocal<List<String>> CURRENT_PERMISSIONS = new ThreadLocal<>();
////添加
//    public static void setPermissions(List<String> permissions) {
//        CURRENT_PERMISSIONS.set(permissions);
//    }
////获取ThreadLocal
//    public static List<String> getPermissions() {
//        return CURRENT_PERMISSIONS.get();
//    }
////删除ThreadLocal
//    public static void remove() {
//        CURRENT_PERMISSIONS.remove();
//    }
//
//}