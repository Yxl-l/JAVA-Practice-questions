package com.yxl.homework;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入出生日期：（如1998年08月07日");
        String birthday = sc.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate t1=LocalDate.parse(birthday,dtf);
        LocalDate t2=LocalDate.now();
//        System.out.println(t2.getYear());
        t1 = t1.withYear(t2.getYear());
//        System.out.println(t1);、

        if (t1.isBefore(t2)){
            LocalDate  t3 = t1.plusYears(1);
            System.out.println("距离生日还有"+Period.between(t2,t3).getMonths()+"月"+Period.between(t2,t3).getDays()+"天");
        }else if (t1.isAfter(t2)){
            System.out.println("距离生日还有"+Period.between(t2,t1).getMonths()+"月"+Period.between(t2,t1).getDays()+"天");
        }

    }
}
