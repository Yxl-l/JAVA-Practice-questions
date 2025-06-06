package com.yxl.demo01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"蔡徐坤","蔡徐龙","蔡徐","蔡坤","徐坤","徐坤蔡","蔡徐申");
        List<String> newlist = list.stream()
                .filter(l->l.startsWith("蔡"))
                .filter(l->l.length()==3)
                .collect(Collectors.toList());
        System.out.println(newlist);

        Map<String,Integer> map = new HashMap<>();
        map.put("蔡徐坤",1);
        map.put("蔡坤",2);
        map.put("蔡",3);
        map.put("蔡1徐坤",4);
        map.put("蔡徐2坤",5);
        Stream<String> stream1 = map.keySet().stream();
        Stream<Integer> stream2 = map.values().stream();
        Stream<Map.Entry<String,Integer>> stream= map.entrySet().stream();

        Integer [] arr = {1,2,3};
        Stream<Integer> system3=Arrays.stream(arr);
    }
}
