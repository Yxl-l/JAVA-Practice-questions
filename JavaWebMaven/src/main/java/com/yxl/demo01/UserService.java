package com.yxl.demo01;

public class UserService {
    public int getAge(String a){
        System.out.println("获取年龄");
        return 18;
    }
    public String getSex(int a){
        return a%2==0? "男":"女";

    }

}
