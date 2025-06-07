package com.yxl.demo03;

import java.io.*;

public class Text01 {
    public static void main(String[] args)  {
        try (
                InputStream is = new FileInputStream("D:/qqq.txt");
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream("E:/qqq.txt");
                OutputStream obs = new BufferedOutputStream(os);
                ){

            byte[] bytes=new byte[1024];
            int len ;
            while ((len=bis.read(bytes))!=-1){
                obs.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
