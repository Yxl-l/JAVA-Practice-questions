package com.yxl.dome02;


import java.util.LinkedList;

public class Text3 {
    public static void main(String[] args) {
        LinkedList<String> list = new  LinkedList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);
        list.addFirst("辣条");
        list.addLast("泡面");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);


    }
}
