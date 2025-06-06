package com.yxl.demo01;

import java.io.*;

public class Text4 {
    public static void main(String[] args)  {
        try {
            InputStream is = new FileInputStream("D:/qqq.txt");
            OutputStream OS = new FileOutputStream("E:/qqq.txt");
            int l ;
            byte[] bytes = new byte[1024];
            while ((l= is.read(bytes))!=-1){
                OS.write(bytes,0,l);
            }
            System.out.println("复制完成");
            is.close();
            OS.close();

            InputStream iso = new FileInputStream("E:/qqq.txt");
            int len ;
            byte[] bytes1 = new byte[100];
            while ((len=iso.read(bytes1))!=-1){
                String s = new String(bytes1,0,len);
                System.out.print(s);
            }
            iso.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
