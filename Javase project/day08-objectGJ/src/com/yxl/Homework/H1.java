package com.yxl.Homework;

import java.util.ArrayList;

public class H1 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        ArrayList<String>list1 = new ArrayList<>();
        list.add("张无忌");;
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3) {
                list1.add(s);
            }
        }
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
