package com.yxl.classroom;

public class Coed3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5000000,546,5588,884448,64947,3323656};
        System.out.println(sum(arr));
    }

    /**
     * 求数组和返回和
     * @param arr
     * @return
     */
    public static int sum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
