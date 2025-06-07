package com.yxl.d2_API;

import java.util.Date;

public class Code6 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long d3=d.getTime();
        System.out.println(d3);
        Date d4 = new Date(d3+3600*1000);
        System.out.println(d4);
    }
}
