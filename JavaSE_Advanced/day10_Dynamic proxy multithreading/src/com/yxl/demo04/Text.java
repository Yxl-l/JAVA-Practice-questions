package com.yxl.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Text {



    public static void main(String[] args) {
     BigStar bigStar = new BigStar("蔡徐坤");

     dailiStar dailiStar = new dailiStar(bigStar);
        dailiStar.dance();
        dailiStar.sing("及你太美");
    }
}
