package com.yxl.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class H3 {
    public static void main(String[] args) {
        String s = "20 30 33 55 66 88";
        String [] arr=s.split(" ");
        int sum=0;
        for (String string : arr) {
            sum += Integer.parseInt(string);
        }
        System.out.println("平均值"+ BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(arr.length),
                3, RoundingMode.HALF_UP).doubleValue());
    }
}
