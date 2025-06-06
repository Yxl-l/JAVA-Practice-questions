package com.yxl.demo02;

public class Text1 {
    public static void main(String[] args) {
        MyArrayList<String> mlist = new MyArrayList<>();
        mlist.add("131414");

        mlist.add("efeafaegaeg");
        mlist.add("123");
        mlist.remove("123");
        System.out.println(mlist.toString());
    }
}
