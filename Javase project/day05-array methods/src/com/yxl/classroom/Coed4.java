package com.yxl.classroom;


import java.util.Arrays;

public class Coed4 {
    public static void main(String[] args) {

            int[] arr={1,2,3,4,5000000,546,5588,884448,64947,3323656};
            System.out.println(Arrays.toString(arr));
            reoo(arr);
        }
    public static void reoo(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i==0){
                System.out.print("["+arr[i]+",");
            }else if (i==arr.length-1){
                System.out.print(arr[i]+"]");
                System.out.println("\n");
            }else {
                System.out.print(arr[i]+",");

            }

        }

    }




    }


