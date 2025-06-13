package com.yxl.sw;

import java.util.HashMap;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            String typ = sc.next();

            if (!typ.equals("end")) {
                // 如果存在则获取当前值+1，否则设为1
                map.put(typ, map.getOrDefault(typ, 0) + 1);
            } else {
                map.forEach((k, v) -> System.out.println(k + "的销量是" + v));
                return;
            }
        }
        }
    }


