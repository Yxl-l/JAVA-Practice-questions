package com.homework.demo07;

public class Text {
    public static void main(String[] args) {
        Card card=new Gold("鄂A10001", "13800000000", "张三", 6000);
        CardOperator.consume(card,2000);
        CardOperator.recharge(card,100000);
    }
}
