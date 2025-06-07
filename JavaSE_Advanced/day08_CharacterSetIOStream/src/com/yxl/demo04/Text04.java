package com.yxl.demo04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
