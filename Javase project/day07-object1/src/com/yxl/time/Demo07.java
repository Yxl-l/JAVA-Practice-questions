package com.yxl.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    目标：掌握日期格式器DateTimeFormatter的使用
    1 常见日期格式：
        yyyy年MM月dd日 HH时mm分ss秒
        yyyy-MM-dd HH:mm:ss
    2 获取DateTimeFormatter格式化器：
       public static DateTimeFormatter ofPattern(时间模式/格式)
    3 LocalDateTime提供的格式化、解析时间的方法：
        public String format(DateTimeFormatter formatter)：格式化时间
        public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)：解析时间
 */
public class Demo07 {
    public static void main(String[] args) {
        // 1、创建一个DateTimeFormatter格式化器对象，指定格式为"yyyy年MM月dd日 HH:mm:ss"
        System.out.println("1、-----------------------");
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss喵");
        LocalDateTime t1=LocalDateTime.now();
        // 2、对时间进行格式化
        System.out.println("2、-----------------------");
        System.out.println("格式化前"+t1);
        System.out.println("格式化后"+t1.format(dtf));

        // 3、解析时间：将"2029年12月12日 12:12:11"解析为LocalDateTime对象
        System.out.println("3、-----------------------");
        LocalDateTime t2=LocalDateTime.parse("2029年12月12日 12时12分11喵",dtf);
        System.out.println(t2);
    }
}
