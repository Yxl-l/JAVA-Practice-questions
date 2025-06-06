package com.yxl.demo01;

import java.io.*;

public class Text2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/qqq.txt");
       InputStream  is = new FileInputStream(f1);
//        int b ;
//        while ((b= is.read())!=-1){
//            System.out.print((char) b);
//        }

//        byte[] bytes = new byte[3];
//        int len;
//        while ((len= is.read(bytes))!=-1){
//            String s = new String(bytes,0,len);//读取0-len的内容
//            System.out.print(s);
//        }

//      byte[] bytes = is.readAllBytes();
//      String s = new String(bytes);
//        System.out.println(s);
        byte[] bytes = is.readAllBytes();
        String s = new String(bytes);
        System.out.println(s);

        is.close();
    }
}
