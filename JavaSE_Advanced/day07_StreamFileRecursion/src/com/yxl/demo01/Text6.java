package com.yxl.demo01;

import java.io.File;

import static java.nio.file.Files.delete;

public class Text6 {
    public static void main(String[] args) {
        File f1 = new File("D:/wdawdcb");
        deleteFile(f1);
    }
    private static void deleteFile(File f1) {
        if (f1==null||!f1.exists()){
            return;
        }
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteFile(file);
                file.delete();
            }
        }
        f1.delete();
    }
}
