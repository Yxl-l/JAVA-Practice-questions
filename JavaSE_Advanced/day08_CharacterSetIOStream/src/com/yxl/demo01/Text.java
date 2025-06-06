package com.yxl.demo01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Text {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "qwe强e123";
//        byte[] bytes = s.getBytes();
        byte[] bytes = s.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        String name = new String(bytes,"GBK");
        System.out.println(name);
    }
}
