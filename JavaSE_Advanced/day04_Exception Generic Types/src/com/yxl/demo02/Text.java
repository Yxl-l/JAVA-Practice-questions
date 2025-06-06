package com.yxl.demo02;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
//        arrayList.add(12);
        arrayList.add("蔡徐坤");

        for (String s : arrayList){
            String a=s;
            System.out.println(a);

        }
    }
}
