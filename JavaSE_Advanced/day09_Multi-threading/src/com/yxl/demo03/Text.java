package com.yxl.demo03;

public class Text {
    public static void main(String[] args) {
        Acc acc = new Acc("001A",10000);
         new AccThread("吴亦凡取钱",acc).start();
         new AccThread("蔡徐坤取钱",acc).start();
    }
}
