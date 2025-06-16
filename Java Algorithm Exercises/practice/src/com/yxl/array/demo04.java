package com.yxl.array;

import java.util.Arrays;

public class demo04 {
    public static void main(String[] args) {


        int[] arr = {1,2,7,4,2,7,2,2,2,1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int k = 0; k < arr.length-1-i; k++) {
                if (arr[k]>=arr[k+1]){
                    int a =arr[k+1] ;
                    arr[k+1]=arr[k];
                    arr[k]=a;
                }
            }

        }
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        System.out.println(j);
    }
}
