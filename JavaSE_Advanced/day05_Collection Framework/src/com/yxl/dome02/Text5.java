package com.yxl.dome02;


import java.util.LinkedList;

public class Text5 {
    public static void main(String[] args) {
        LinkedList<String> list = new  LinkedList<>();//做一个栈
        list.push("Java入门");//压栈
        list.push("宁夏枸杞");
        list.push("黑枸杞");
        list.push("人字拖");
        list.push("特级枸杞");
        list.push("枸杞子");
        list.push("西洋参");
        System.out.println(list);
        System.out.println(list.pop());//出栈
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list);




    }
}
