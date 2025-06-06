package com.yxl.GAME;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("蔡徐坤");
        arr.add("范丞丞");
        arr.add("陈立龙");

        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        for (String s : arr){
            System.out.println(s);
        }
    }
}
