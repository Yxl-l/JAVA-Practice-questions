package com.yxl.homework;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入英文：");
        String english = sc.nextLine();
        System.out.println(printEnglish(english));
    }
    public static int  printEnglish(String english)
    {
        String [] arr=english.split(" ");
        int num=0;
        if (arr.length!=0){

            for (int i = 0; i < arr.length; i++){
                if(arr[i].startsWith("p")){
                    num++;
                }
            }

        }else {
            return 0;
        }
        return num;
    }
}
