package com.yxl.Demo03;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("蔡立龙");
        list.add("蔡范丞丞");
        list.add("蔡小龙");
        list.add("小龙");
        list.add("小胡桃");
        System.out.println(list);
        list.add("小芙芙");

        for (int i = list.size() - 1; i >= 0; i--) {
            String xing = list.get(i);
            if(xing.contains("蔡")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
