package com.homework.demo02;

import java.util.*;

public class Text2 {
    public static void main(String[] args) {
        String[] keys = {"A", "B", "C", "D"};
        Random r = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            //投票集合
            list.add(keys[r.nextInt(keys.length)]);
        }
        //创建计票集合
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <keys.length; i++) {
            //Collections.frequency()获取list集合指定元素出现次数
            map.put(keys[i],Collections.frequency(list,keys[i]) );//keys[i]=abcd对应4个景点的次数
        }
        map.forEach((k,v)-> System.out.println(k+":"+v));
        }
    }

