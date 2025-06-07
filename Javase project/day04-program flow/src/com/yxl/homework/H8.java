package com.yxl.homework;

import java.util.Random;

public class H8 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum=0,num=0;
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i]=r.nextInt(1,101 );
            sum+=arr[i];
            num=sum/arr.length;
            System.out.print(arr[i]+"\t");
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]<=min){
               min=arr[i];
            }
        }
        System.out.println("最大值"+max+"最小值"+min+"和"+sum+"平均值"+num);
    }
}
