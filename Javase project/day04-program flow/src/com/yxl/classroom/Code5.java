package com.yxl.classroom;

public class Code5 {
    public static void main(String[] args) {
        int sum=0,num=0,i=100;
        while (i<1000){
            sum=(i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i/100)*(i/100)*(i/100);
            if (sum==i){
                System.out.println(i);
                num++;
            }
            i++;
        }
        System.out.println("水仙花个数有"+ num +"个");

    }
}
