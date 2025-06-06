package com.yxl.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Text {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Collections.addAll(list,1,8,7,5,15,7);
        Stream<Integer> L = list.stream();
//        list.stream().filter(s->s>7).forEach(System.out::println);
//        list.stream().sorted().forEach(System.out::println);
//        list.stream().sorted((s1,s2)->s2-s1).forEach(System.out::println);
//        list.stream().skip(2).limit(3).filter(s->s<=8).forEach(System.out::println);
//        list.stream().distinct().forEach(System.out::println);
//        list.stream().map((s->s+=2).
                List <Integer> strings = new ArrayList<>();
                strings.add(100);
                Stream<Integer> s = strings.stream();



    }

}
