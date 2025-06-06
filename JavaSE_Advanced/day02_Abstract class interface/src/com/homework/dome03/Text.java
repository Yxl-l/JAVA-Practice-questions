package com.homework.dome03;

public class Text {
    public static void love(People people){
        people.write();
    }

    public static void main(String[] args) {
        People taozi = new TaoZi();
        love(taozi);
        People fufu = new FuFu();
        love(fufu);
    }
}
