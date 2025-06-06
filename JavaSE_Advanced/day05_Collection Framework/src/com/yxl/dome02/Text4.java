package com.yxl.dome02;


import java.util.LinkedList;

public class Text4 {
    public static void main(String[] args) {
        LinkedList<String> list = new  LinkedList<>();
        list.addLast("Java入门");//入对
        list.addLast("宁夏枸杞");
        list.addLast("黑枸杞");
        list.addLast("人字拖");
        list.addLast("特级枸杞");
        list.addLast("枸杞子");
        list.addLast("西洋参");
        System.out.println(list);
        System.out.println(list.removeFirst());//出队
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);




    }
}
