package com.yxl.time;

/**
 * Math工具类的使用
 */
public class Demo09 {
    public static void main(String[] args) {
        //static double ceil(double a) 向上取整。
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.9));

        //static double floor(double a) 向下取整。
        System.out.println(Math.floor(3.1));
        //static int max(int a, int b) 返回两个int中的较大值。也有重载的方法，参数为long、double、float类型。
        System.out.println(Math.max(3,4));
        //static int min(int a, int b) 返回两个 int中的较小值。 ，也有重载的方法，参数为long、double、float类型。
        System.out.println(Math.min(3,4));
        //static double random() 返回值为 double的正值，大于等于 0.0 ，小于 1.0 。
        System.out.println(Math.random()+"随机生成大于等于0小于1的数字");
        //static long round(double a) 四舍五入。
        System.out.println(Math.round(5.588));
    }
}
