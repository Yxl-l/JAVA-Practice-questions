package com.yxl.dome02;

import java.util.ArrayList;

public class Text2 {
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

//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).contains("枸杞")){
//                list.remove(i);
//                i--;
//            }
//        }
//        Iterator<String> it= list.iterator();
//        while (it.hasNext()){
//            if(it.next().contains("枸杞")){
//                it.remove();
//            }
//        }
        list.removeIf(s -> s.contains("枸杞"));
        System.out.println(list);
    }
}
