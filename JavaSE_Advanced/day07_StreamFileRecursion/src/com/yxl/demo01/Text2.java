package com.yxl.demo01;

import java.util.*;
import java.util.stream.Stream;

public class Text2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 8, 7, 5, 15, 7);
        Stream<Integer> l = list.stream();
//        l.forEach(System.out::println);


        long count =list.stream().filter(o->o>5).count();
        System.out.println(count);
        Optional<Integer> max=list.stream().max((o1, o2) -> o1-o2);
        Integer maxList = max.get();
        System.out.println(maxList);



    }

    }
