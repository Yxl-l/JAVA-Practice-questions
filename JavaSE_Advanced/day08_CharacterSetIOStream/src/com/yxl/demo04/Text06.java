package com.yxl.demo04;

import java.io.FileOutputStream;
import java.io.PrintStream;


public class Text06 {
    public static void main(String[] args) {
        try( PrintStream ps = new PrintStream(new FileOutputStream("D:/zz.txt"),true);

        ) {
            ps.print(97);
            ps.println('a');
            ps.print('r');
            ps.println("蔡徐坤");
            ps.print(9.9);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
