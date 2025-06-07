package com.yxl.classroom;

public class Code6 {
    public static void main(String[] args) {
//   double money=0;int year=0;
//   for (money=100000;money<200000;money*=1.017){
//       year++;
//   }
        double money=100000;int year=0;
//        while (money<200000){
//            money*=1.017;
//            year++;
//        }
        do{
            money*=1.017;
            year++;
        }while (money<200000);
        System.out.println(year+"年本金翻倍"+money);
    }
}
