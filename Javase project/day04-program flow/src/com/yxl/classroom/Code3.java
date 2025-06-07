package com.yxl.classroom;

public class Code3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print("🐖");
            }
            System.out.println("\n");

        }
        int sum=0;
        for (int i = 0; i < 100; i++){
          if(i%2!=0){
              sum+=i;
          }
        }
        System.out.println(sum);


    }
}
