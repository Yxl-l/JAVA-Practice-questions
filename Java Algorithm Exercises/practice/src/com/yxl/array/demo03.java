package com.yxl.array;

import java.util.Arrays;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 *
 * 说明：
 *
 * 为什么返回数值是整数，但输出的答案是数组呢？
 *
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 你可以想象内部操作如下:
 *
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 *
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 *
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
 */

public class demo03 {
    public static void main(String[] args) {
        int[]nums = {5,4,8,5,7,8,8,4,8,7,7,7,6,7,2,1,0,4};

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j <nums.length-1-i ; j++) {
                if (nums[j]>=nums[j+1]){
                    int a = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=a;
                }
            }
        }



        int j = 2; // 快指针，从第三个元素开始

        for (int i = 2; i < nums.length; i++) {
            // 如果当前元素不等于前面两个位置的元素，说明可以保留
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }


        // 打印排序结果
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]);
        }
        System.out.println(j);
    }


    }

