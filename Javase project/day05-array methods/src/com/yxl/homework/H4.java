package com.yxl.homework;

import java.util.Arrays;

import static com.yxl.homework.H1.arrAgs;

public class H4 {
    public static void main(String[] args) {
       int[]arr=  arrAgs(30,1,999);
        System.out.println(Arrays.toString(arr));
        System.out.println("质数有：");
        num(arr);
    }
    public static void num(int [] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 2; j <arr[i]; j++){
                if(arr[i]<2){
                    continue;
                }
                if(arr[i]==2){
                    System.out.print(arr[i]+"\t");
                }
                if(arr[i]%j==0){
                    break;
                }
                if(j+1==arr[i]){
                    System.out.print(arr[i]+"\t");
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("没有质数");
        }
    }
}
