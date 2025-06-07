package com.yxl.classroom;

import java.util.Arrays;
import java.util.Random;

public class Coed5 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrAgs(20)));


    }

    public static int[] arrAgs(int n) {
        Random r = new Random();
        int [] arr=new int[n];
        for (int i=0;i< arr.length;){
            int num=r.nextInt(1,100);
            if (num%2==1){
                arr[i]=num;
                i++;
            }
        }
        return arr;
    }
}
