package com.yxl.demo02;

public class Text4 {
    public static void main(String[] args) {
        String[] arr = {"qq","ww","ee"};
        arrMax(arr);
        arrShow(arr);

    }
    public static  <A> A arrMax(A[] arr){
        System.out.println("arrmax执行了");
        return null;
    }
    public static <W> void arrShow(W[] arr){
        System.out.println("arrshow执行了");
    }
}
