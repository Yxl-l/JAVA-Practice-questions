package com.yxl.demo01;

public class Text2 {
    public static int div(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("除数不能为0");
        }
        return a/b;
    }
    public static void main(String[] args) {
        try {
            div(10,0);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
