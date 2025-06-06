package com.yxl.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorB {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("范丞丞");
        list.add("陈立龙");
        Iterator<String> iterator = list.iterator();

        for (String s : list) {
            System.out.println(list);
        }

        list.forEach(System.out::println);

    }
}
