package com.yxl;

import java.util.Arrays;
import java.util.Random;

public class A20 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i]= r.nextInt(1, 100);
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(getScore(arr));
    }

    public static int getScore(int [] arr){
        int sum=0; double  a = 0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
            a = (double) sum / arr.length;
        }
        int cont=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>a){
                cont++;
            }
        }

return cont;
}
}