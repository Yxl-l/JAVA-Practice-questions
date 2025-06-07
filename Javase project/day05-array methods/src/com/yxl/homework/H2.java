package com.yxl.homework;

import java.util.Arrays;

import static com.yxl.homework.H1.arrAgs;

public class H2 {
    public static void main(String[] args) {
        int[] arr=arrAgs(10,100,999);
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("平均值"+sum/arr.length);
        System.out.println("最大值"+arrMaxMin(arr)[0]+"最小值"+arrMaxMin(arr)[1]);
        System.out.println("新平均值"+(sum-arrMaxMin(arr)[0]-arrMaxMin(arr)[1])/(arr.length-2));
    }

    public static int[] arrMaxMin(int[] arr) {
        int max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new int[]{max,min};
    }
}
