package com.yxl.demo01;

import java.io.*;

public class Text5 {
    public static void main(String[] args)  {
        InputStream is=null;
        OutputStream OS=null;
        InputStream iso = null;
        try {
             is = new FileInputStream("D:/qqq.txt");
             OS = new FileOutputStream("E:/qqq.txt");
            int l ;
            byte[] bytes = new byte[1024];
            while ((l= is.read(bytes))!=-1){
                OS.write(bytes,0,l);
            }
            System.out.println("复制成功");


             iso = new FileInputStream("E:/qqq.txt");
            int len ;
            byte[] bytes1 = new byte[100];
            while ((len=iso.read(bytes1))!=-1){
                String s = new String(bytes1,0,len);
                System.out.print(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       finally {
            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (OS!=null){
                    OS.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (iso!=null){
                    iso.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
