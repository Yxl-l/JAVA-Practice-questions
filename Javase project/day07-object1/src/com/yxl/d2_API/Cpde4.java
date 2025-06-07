package com.yxl.d2_API;

public class Cpde4 {
    public static void main(String[] args) {
        String s1 = "hello";//在字符串常量里
        String s2 = "hello";
        System.out.println(s1 == s2); //==比较地址
        System.out.println(s1.equals(s2));

      char[]arr={'h','e','l','l','o'};
      String s3 = new String(arr);
      String s4 = new String(arr);
      System.out.println(s4 == s3);//==比较地址
        System.out.println(s4 == s1);
    }
}
