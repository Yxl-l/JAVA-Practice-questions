package com.homework.demo03;

import java.util.Arrays;

public class qqq {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        System.arraycopy(nums1, 0, nums3, 0,m);
        System.arraycopy(nums2, 0, nums3, m,n);
        nums1=nums3;
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1={0,2,3,4};int m=4,n=4;
        int[] nums2={0,2,3,4};
        merge(nums1,4,nums2,4);
    }
}
