package com.yxl.demo02;

public class Text2 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(TaoZi(n));
    }

    private static int TaoZi(int i) {

        if(i==10){
            return 1;
        }
        return 2*TaoZi(i+1)+2;

    }
}
