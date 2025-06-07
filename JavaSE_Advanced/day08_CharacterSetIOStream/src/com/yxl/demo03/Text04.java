package com.yxl.demo03;

import java.io.*;

public class Text04 {
    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(new FileInputStream("D:/qqq.txt"),"GBK");
        BufferedReader br = new BufferedReader(r);
        String len ;
        while ((len=br.readLine())!=null){
            System.out.println(len);
        }

    }
}
