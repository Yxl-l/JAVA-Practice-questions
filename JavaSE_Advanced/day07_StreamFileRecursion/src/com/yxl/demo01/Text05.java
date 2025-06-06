package com.yxl.demo01;
import java.io.File;
import java.io.IOException;

/**
 *
 */
public class Text05 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:/miHoYo Launcher");
        String fileName = "launcher.exe";
        findTheFile(f1,fileName);

    }

    private static void findTheFile(File f1, String fileName) throws IOException {
        if (f1==null || !f1.exists() || f1.isFile()){
            return;
        }
        File[] files= f1.listFiles();
        for (File file : files) {
            if (file.isFile()){
                if (file.getName().equals(fileName)){
                    System.out.println(file.getAbsolutePath()+"找到目标文件"+fileName);
                    Runtime run = Runtime.getRuntime();
                    run.exec(file.getAbsolutePath());
                }
            }else {
                findTheFile(file,fileName);

            }
        }
    }

}
