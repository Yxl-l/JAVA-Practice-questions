package com.homework.demo04;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class homework_02 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random r = new Random();
       for (int i = 0 ; i<6 ; i = set.size()) {
            set.add(r.nextInt(1,34));
        }
        for (Integer integer : set) {
            System.out.print("红球"+(integer<10? "0"+integer:integer )+"\t");
        }
        int b=r.nextInt(1,17);
        System.out.print("篮球"+(b<10? "0"+b:b )+"\t");
    }
}
