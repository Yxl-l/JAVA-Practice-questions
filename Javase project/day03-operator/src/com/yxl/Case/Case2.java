package com.yxl.Case;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：单位m");
        double h = sc.nextDouble();
        System.out.println("请输入体重：单位kg");
        double w = sc.nextDouble();
        double bmi = w / (h * h);
        System.out.println("BMI=" + bmi);
        if (bmi < 18.5) {
            System.out.println("体重过轻");
        } else if (bmi >= 18.5 & bmi < 24.9) {
            System.out.println("体重正常");
        } else if (bmi >= 24.9 & bmi < 29.9) {
            System.out.println("超重");
        } else if (bmi >= 29.9) {
            System.out.println("肥猪🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" +
                    "🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖");
        }


//        String result= bmi<=18.5? "体重过轻" : "";
//        result= bmi>18.5 && bmi<=24.9? "体重正常" : result;
//        result= bmi>24.9 && bmi<=29.9? "超重" : result;
//        result= bmi>29.9? "肥猪🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖🐖" : result;
//        System.out.println(result);
    }
}
