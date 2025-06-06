package com.yxl.demo04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("蔡徐坤",25);
        map.put("范丞丞",30);
        map.put("成龙",37);
        map.put("杨小龙",23);
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+ map.get(s));
        }
        System.out.println("=================");

        map.forEach((s,i)-> System.out.println(s+i));
        System.out.println("=================");

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }



    }
}
