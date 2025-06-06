package com.yxl.demo01;

import java.io.*;

public class Text3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/qqq.txt");
        FileOutputStream fos = new FileOutputStream(f1);
        fos.write(97);
        fos.write("\n".getBytes());
        fos.write('c');
        fos.write("\n".getBytes());
        String s = "杨小龙杨小龙杨小龙";
        fos.write(s.getBytes());
        fos.write("\n".getBytes());
        fos.write(s.getBytes(),0,9);
        fos.close();


        InputStream is = new FileInputStream(f1);
       byte[] bytes= is.readAllBytes();
       String string = new String(bytes);
        System.out.println(string);
        is.close();

    }
}
