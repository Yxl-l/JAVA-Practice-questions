package com.yxl.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
目标：JDK8日期类LocalDateTime、LocalDate、LocalTime常用方法
 */
public class Demo06 {
    public static void main(String[] args) {
        // 1、获取本地当前日期和时间对象。
        LocalDate t1 = LocalDate.now();
        LocalTime t2=  LocalTime.now();
        LocalDateTime t3 = LocalDateTime.now();
        System.out.println(t1+" \n"+t2+"\n "+t3);
        System.out.println("1、---------------------");

        LocalDateTime t4=LocalDateTime.of(2029,12,12,12,12,12);
        System.out.println(t4);
        LocalTime t5=LocalTime.of(12,12,12);
        System.out.println(t5);
        // 2、获取本地指定日期和时间对象：2029年12月12日12时12分12秒
        System.out.println("2、---------------------");

        System.out.println(t3.getYear()+"年"+t3.getMonthValue()+"月"+t3.getDayOfMonth()+"日"+t3.getHour()+"时"+t3.getMinute()+"分"+t3.getSecond()+"秒");
        // 3、可以获取日期和时间的全部信息（年、月、日、时、分、秒、年中的天、星期几）
        System.out.println("3、---------------------");

        LocalDateTime t6=t3.withYear(2029).withMonth(12).withDayOfMonth(8);
        System.out.println(t6);
        // 4、修改时间信息：withYear withMonth withDayOfMonth withDayOfYear withHour withMinute withSecond withNano
        System.out.println("4、---------------------");

        LocalDateTime t7=t3.plusDays(20).plusYears(1).plusMonths(2);
        System.out.println(t7);
        // 5、加多少: plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
        System.out.println("5、---------------------");

        LocalDateTime t8=t3.minusDays(20).minusYears(1).minusMonths(2);
        System.out.println(t8);
        // 6、减多少：minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
        System.out.println("6、---------------------");

        System.out.println(t3.equals(t8));//t3是否等于t8
        System.out.println(t3.isAfter(t8));//t3是否在t8之后
        System.out.println(t3.isBefore(t8));//t3是否在t8之前
        // 7、 判断2个日期、时间对象，所表示的时间是否相等，在前还是在后： equals、isBefore、isAfter
        System.out.println("7、---------------------");

        System.out.println(t3.toLocalDate());
        System.out.println(t3.toLocalTime());
        // 8、可以把LocalDateTime转换成LocalDate和LocalTime
        System.out.println("8、---------------------");
    }
}
