package com.yxl.demo02;

import java.io.File;

public class Text1 {
    public static void main(String[] args) {
        File f1 = new File("D:/yxl");
        deleteFole(f1);
    }

    private static void deleteFole(File f1) {
        if (f1==null||!f1.exists()){
            return;
        }
        File[] files = f1.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }
            else {
                deleteFole(file);
            }

        }
        f1.delete();
    }
}
