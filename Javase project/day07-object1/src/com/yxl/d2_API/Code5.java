package com.yxl.d2_API;

import java.util.Random;

public class Code5 {
    public static void main(String[] args) {
        System.out.println("五位验证码"+test(5));

    }
    public static String test(int n){
        String  s="";
        String a="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        Random  r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(a.length());
            s+=a.charAt(index);
        }
        return s;

    }
}
