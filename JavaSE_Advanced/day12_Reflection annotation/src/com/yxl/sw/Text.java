package com.yxl.sw;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        String s = "90 -7 0 18 2 0 2 2 45 4";
        String[] strings = s.split(" ");
        System.out.println(Arrays.toString(strings));
        List<String> list = Arrays.asList(strings);
        Collections.sort(list,(s1,s2)->Integer.parseInt(s2) - Integer.parseInt(s1));
        System.out.println(list);

    }
}
