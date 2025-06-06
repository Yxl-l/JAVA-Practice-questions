package com.yxl.demo01;

import java.io.File;
import java.io.IOException;

public class Text4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/aaa.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists()+"是否是文件-》"+f1.isFile()+"是否是文件夹-》"+f1.isDirectory());
        System.out.println("获取文件名称包括后缀"+f1.getName());
        System.out.println("获取文件字节数"+f1.length());
        System.out.println("获取文件最后修改时间"+f1.lastModified());
        System.out.println("获取创建文件时的路径"+f1.getPath());
        System.out.println("获取绝对路径"+f1.getAbsolutePath());


        File f2 = new File("D:/qw2e2e");
        f2.mkdir();
        f2.delete();
        File f3 = new File("D:/aa");
        File f4 = new File("D:/aadwdawdcb/aaa/aadadad/adadadad/wew.txt");
        f3.mkdir();
        f3.delete();
        f4.mkdirs();
        f4.delete();
        File f5 = new File("D:/wdawdcb/aaa/aadadad/adadadad/yxl.docx");

        System.out.println(f5.length());






    }
}
