package com.yxl.demo04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("蔡徐坤",25);
        map.put("范丞丞",30);
        map.put("成龙",37);
        map.put("杨小龙",23);
        System.out.println(map);
        System.out.println("===========");
        System.out.println(map.get("杨小龙"));
        System.out.println("===========");
        System.out.println(map.containsKey("蔡徐坤"));
        System.out.println(map.containsKey("蔡"));
        System.out.println(map.containsValue(30));
        System.out.println(map.containsValue(388));
        System.out.println(map.isEmpty());
        System.out.println("===========");
        map.remove("范丞丞");
        System.out.println(map);
        System.out.println("===========");
        System.out.println(map.size());
        System.out.println("===========");

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("===========");
        Collection<Integer> collection = map.values();
        for (Integer integer : collection) {
            System.out.println(integer);
        }
        System.out.println("===========");
        map.clear();
        System.out.println(map);





    }
}
