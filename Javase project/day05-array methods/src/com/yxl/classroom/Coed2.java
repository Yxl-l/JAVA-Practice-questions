package com.yxl.classroom;

public class Coed2 {
    public static void main(String[] args) {
        getAge(18);
        System.out.println("姓名：" + getName("yxl"));
        getName();
        System.out.println("性别：" + getSex());
    }
    public static void  getAge(int age){
        System.out.println("年龄：" + age);//有参无返
    }
    public static String getName(String name){
        return name;//有参有反
    }
    public static void getName(){
        System.out.println("无参无返");//无参无返
    }
    public static String getSex(){
        return "男";//无参有返
    }
}
