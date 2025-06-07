package com.yxl.homework;

public class H7 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <= 1000; i++) {
            if (i%2==0 && i%3==0){
                a++;
                if (a<=2){
                    System.out.print(i+"\t");
                }
                if (a==3){
                    System.out.println("\n");
                    System.out.print(i+"\t");
                }
                if (a==4){
                    System.out.print(i+"\t");
                }
                if (a==5){
                    System.out.print(i+"\t");
                    System.out.println("\n");
                    a=0;
                }
            }

        }
    }
}
