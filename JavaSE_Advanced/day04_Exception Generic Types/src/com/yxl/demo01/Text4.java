package com.yxl.demo01;

public class Text4 {
    public static void main(String[] args) {

        try {
            saveAge(220);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static void saveAge(int age) {//run运行时异常不需要抛出
        if(age>200 ||age<1){
            throw new ItheimaAgeIllegalRuntimeException("年龄不合法");
        }
        else {
            System.out.println("年龄合法");
        }
    }
}
