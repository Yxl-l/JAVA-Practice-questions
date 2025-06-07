package com.yxl.debug;

import java.util.Random;

public class Suijishu {
    public static void main(String[] args) {
        Random r=new Random();
        int a=r.nextInt(1000);//生成0-1000的随机数不包括1000，[0-1000）
        System.out.println(a);
        for (int i = 0; i < 10; i++){
            int w=r.nextInt(100,1000 );
//            System.out.println(w);生成980-1000的随机数[980,1000)
            if (w>=500){
                System.out.println(w+"大");
                }
            else {
                System.out.println(w+"小");
            }

             }
    }
}
