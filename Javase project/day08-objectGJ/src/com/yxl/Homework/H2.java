package com.yxl.Homework;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

public class H2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("I");
        list.add("am");
        list.add("learning");
        list.add("Java");
        list.add("at");
        list.add("Heima");
        for (String s : list) {
            char[] arr = s.toCharArray();
                for (char c : arr) {
                    if(isUpperCase(c)){
                        System.out.print(c);
                        //使用 Character.isUpperCase(char ch) 判断字符是否为大写字母。
                        //使用 Character.isLowerCase(char ch) 方法，如果字符是小写字母，则返回 true，否则返回 false。
                    }else {
                        System.out.print(toUpperCase(c));
                        //使用 Character.toUpperCase(char ch) 将字符转换为大写。
                        //使用 Character.toLowerCase(char ch) 将字符转换为小写。
                    }
            }
                System.out.print(" ");
        }
    }
}
