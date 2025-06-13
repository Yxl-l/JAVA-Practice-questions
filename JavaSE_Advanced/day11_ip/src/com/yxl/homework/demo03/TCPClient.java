package com.yxl.homework.demo03;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("127.0.0.1",8080);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.next();
            if (s.equals("exit")){
                System.out.println("客户端关闭");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(s);
            dos.flush();
        }
    }
}
