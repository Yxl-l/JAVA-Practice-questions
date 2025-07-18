package com.yxl.time;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
目标：掌握BigDecimal的四则运算
    十进制整数转二进制规则：除二取余，直到相除整数为0
    例如：
        10/2=5...0
        5/2=2...1
        2/2=1...0
        1/2=0...1   故：10转换成二进制结果时1010
    十进制小数转换二进制：将整数和小数部分分别转换成二进制，小数部分转二进制规则：乘以二取整，直到相乘小数部分为0
    例如：
        0.5转换成二进制？
        0.5*2=1.0--->1次就结束了。0.5对应的二进制数为0.1

        0.75转换成二进制？
        0.75*2=1.5--->1
        0.5*2=1.0--->1  2次结束了，0.75对应的二进制是0.11

        10.75转换成二进制？
        10--->1010
        0.75--->0.11
        10.75---->1010.11

        0.2转换成二进制？
        0.2*2=0.4--->0
        0.4*2=0.8--->0
        0.8*2=1.6--->1
        0.6*2=1.2--->1
        0.2*2=0.4--->0
        0.4*2=0.8--->0
        0.8*2=1.6--->1
        0.6*2=1.2--->1   ------->0.001100110011........
 */
public class Demo08 {
    public static void main(String[] args) {
        //问题：小数在进行运算时，由于底层存储原理，有精度损失问题.
        System.out.println(0.09+0.01);
        Double sum=BigDecimal.valueOf(0.09).add(BigDecimal.valueOf(0.01)).doubleValue();
        System.out.println(sum);

        //需求：使用BigDecimal对0.09和0.01进行四则运算

        //1.求和

        System.out.println(BigDecimal.valueOf(0.09).add(BigDecimal.valueOf(0.01)).doubleValue());

        //2.求差
        System.out.println(BigDecimal.valueOf(0.09).subtract(BigDecimal.valueOf(0.01)).doubleValue());

        //3.乘法
        double sum2=BigDecimal.valueOf(0.58474).multiply(BigDecimal.valueOf(0.04854)).doubleValue();
        System.out.println(sum2);
        //4.除法
        BigDecimal bd= BigDecimal.valueOf(20).divide(BigDecimal.valueOf(3),5, RoundingMode.HALF_UP);//做除法需要
        // 保留小数保留5位   HALF_UP四舍五入
        System.out.println(bd);

        /*
        需求：使用BigDecimal做除法运算并保留指定位数的小数
            public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式)
         */

    }
}
