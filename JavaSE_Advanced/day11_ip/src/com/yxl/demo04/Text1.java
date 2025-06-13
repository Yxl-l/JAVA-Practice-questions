package com.yxl.demo04;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc =new Scanner(System.in);
       while (true){
            String s = sc.next();
           dos.writeUTF(s);
           if (s.equals("exit")){
               System.out.println("客户端关闭");
               dos.close();
               socket.close();
               break;
           }
       }



    }
}
