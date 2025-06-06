package com.yxl.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Text7 {
    public static void main(String[] args) {
        try (
            FileWriter fw = new FileWriter("D:/aa.txt");
            FileReader fr = new FileReader("D:/aa.txt");
                ){
            char[] c = {'5','w','8','4'};
            String [] ss={"蔡徐坤","范丞丞"};
            fw.write('4');
            fw.write('T');
            fw.write("\n");
            fw.write("aefagaegaegeafiabafbeagufie");
            fw.write("\n");
            fw.write("蔡徐坤");
            fw.write(c);
            fw.write("\n");
            fw.write(Arrays.toString(ss));
            fw.flush();

            char[] chars = new char[10];
            int len ;
            while ((len= fr.read(chars))!=-1){
                String s = new String(chars,0,len);
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
