package com.homework.demo04.HomeWork_05;

import java.util.HashMap;
import java.util.Scanner;

public class SellGoods {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int value = 1;
        while (true){
            String typ = sc.next();

            if (!typ.equals("end")){
                if (map.containsKey(typ)){
                    value++;
                }
                else {
                    value=1;
                }
                map.put(typ,value);
            }
            else {
             map.forEach((k,v)->   System.out.println(k+"的销售量是："+v));
                return;
            }

        }
    }

}
