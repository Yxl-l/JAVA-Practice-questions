package com.yxl.demo04;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Text08 {
    public static void main(String[] args) {
        try {
            FileUtils.copyFile(new File("D:/qqq.txt"),new File("D:/qq/qq.txt"));
            System.out.println(FileUtils.readFileToString(new File("D:/qq/qq.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
