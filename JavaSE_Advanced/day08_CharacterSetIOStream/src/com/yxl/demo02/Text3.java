package com.yxl.demo02;

import java.io.File;

public class Text3 {
    public static void main(String[] args) {
        File f1 = new File("D:/yxl");
        deleteFile(f1);
    }

    private static void deleteFile(File f1) {
        if (f1==null || !f1.exists()){
            return;
        }
        File [] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }
            else {
                deleteFile(file);
            }
        }
        f1.delete();
    }
}
