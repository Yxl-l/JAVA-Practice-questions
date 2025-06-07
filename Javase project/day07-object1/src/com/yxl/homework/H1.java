package com.yxl.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日：（格式例如2000-04-13）");
        String birthday = sc.nextLine();
        printBirthday(birthday);
        char[] arr=birthday.toCharArray();
        System.out.println(birthday.substring(0,4)+"年");
        System.out.println(birthday.substring(5,7)+"月");
        System.out.println(birthday.substring(8,10)+"日");



    }
public static void  printBirthday(String birthday){
    DateTimeFormatter f1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy年MM月dd日");

    LocalDate t1=LocalDate.parse(birthday,f1);
    System.out.println("您输入的生日是："+t1.format(f2));
}

}
