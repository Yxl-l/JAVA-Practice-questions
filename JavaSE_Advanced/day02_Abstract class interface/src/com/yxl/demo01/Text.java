package com.yxl.demo01;

public class Text extends FinalHome{
//    @Override
//    public void fina() {
//        super.fina();
//    }

    public static void main(String[] args) {
        final int a=10;
//        a++;修饰变量只能赋值一次

       final Name b=new Name("修饰引用类型不能修改地址，可以修改内容");
       b.name="qqq";

    }
}
