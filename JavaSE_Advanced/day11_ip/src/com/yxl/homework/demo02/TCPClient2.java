package com.yxl.homework.demo02;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient2 {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("127.0.0.1",8080);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);

        while (true){
                String msg = sc.next();
                dos.writeUTF(msg);
                dos.flush();
            if (msg.equals("exit")){
                System.out.println("退出客户端");
                dos.close();
                socket.close();
                break;
            }
        }
    }
}
