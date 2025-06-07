package com.yxl.homework;

import java.util.Arrays;
import java.util.Random;

public class H1 {
    public static void main(String[] args) {
        int [] arr=arrAgs(20,100,999);
        System.out.println(Arrays.toString(arr));
        int a=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%10==arr[i]/100){
                System.out.print(arr[i]+"\t");
                a++;
            }
        }
        if (a == 0) {
            System.out.println("没有满足条件的数");
        }

    }
    public static int[] arrAgs(int n,int a,int b){
        Random r = new Random();
        int [] arr=new int[n];
        for (int i=0;i< arr.length;i++){
            int num=r.nextInt(a,b);
                arr[i]=num;
        }
        return arr;
    }
}
