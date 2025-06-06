package com.homework.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Text {
    public static void main(String[] args) {
        Integer [] arr = {12,2324,13,1,224,121314};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
       Arrays.sort(arr,(o1,o2)->o1-o2);


//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

        for (Integer integer:arr){
            System.out.println(integer);
        }





    }
}
