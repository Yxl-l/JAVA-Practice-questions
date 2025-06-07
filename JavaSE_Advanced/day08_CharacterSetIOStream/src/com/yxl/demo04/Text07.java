package com.yxl.demo04;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Text07 {
    public static void main(String[] args) {
        try {
            DataOutputStream ot =new DataOutputStream(new FileOutputStream("D:/LL.txt"));

            ot.writeInt(154);
            ot.writeDouble(4.875);
            ot.writeUTF("无法分");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
