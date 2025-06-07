package com.yxl.demo03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text02 {
    public static void main(String[] args) {

        try(
                BufferedReader br = new BufferedReader(new FileReader("D:/csb.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:/csb.txt"));
                ) {

            List<String> list = new ArrayList<>();
            String s = null;
            while ((s= br.readLine())!=null){
                list.add(s);
            }
            Collections.sort(list);


            for (String string : list) {
                bw.write(string);
                bw.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
