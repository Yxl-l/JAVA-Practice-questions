package com.yxl.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorA {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("范丞丞");
        list.add("陈立龙");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
