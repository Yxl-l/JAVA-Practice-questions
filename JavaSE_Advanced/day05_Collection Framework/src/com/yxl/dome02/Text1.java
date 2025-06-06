package com.yxl.dome02;

import java.util.ArrayList;
import java.util.Iterator;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);

        Iterator<String> arr = list.iterator();
        while (arr.hasNext()){
            System.out.println(arr.next());
        }
        System.out.println("---------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        list.forEach((s)-> System.out.println(s));
        System.out.println("---------------------");
        list.removeIf(s -> s.contains("人字拖"));
        list.forEach(System.out::println);







    }
}
