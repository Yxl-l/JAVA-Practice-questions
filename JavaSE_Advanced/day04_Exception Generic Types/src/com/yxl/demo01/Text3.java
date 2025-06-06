package com.yxl.demo01;

public class Text3 {
    public static void main(String[] args) {
        try {
            saveAge(220);
        } catch (ItheimaAgeIllegalException e) {
           e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public static void saveAge(int age) throws ItheimaAgeIllegalException{//编译时异常需要抛出
        if(age>200 ||age<1){
            throw new ItheimaAgeIllegalException("年龄不合法");
        }
        else {
            System.out.println("年龄合法");
        }
    }
}
