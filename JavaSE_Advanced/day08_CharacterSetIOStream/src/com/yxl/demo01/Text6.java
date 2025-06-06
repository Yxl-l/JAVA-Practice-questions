package com.yxl.demo01;

import java.io.*;

public class Text6 {
    public static void main(String[] args)  {

        try (
                //jdk7以后在这里创建资源对象   用完后自动调用close方法  实现了AutoCloseable接口的的资源对象才行
                InputStream  is = new FileInputStream("D:/qqq.txt");
                OutputStream  OS = new FileOutputStream("E:/qqq.txt");
                InputStream iso = new FileInputStream("E:/qqq.txt");
                ){

            int l ;
            byte[] bytes = new byte[1024];
            while ((l= is.read(bytes))!=-1){
                OS.write(bytes,0,l);
            }
            System.out.println("复制成功");

            int len ;
            byte[] bytes1 = new byte[100];
            while ((len=iso.read(bytes1))!=-1){
                String s = new String(bytes1,0,len);
                System.out.print(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
