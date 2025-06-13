package com.yxl.homework2.TCP;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",9999);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        while (true){
            String msg = sc.next();
            dos.writeUTF(msg);
            if (msg.equals("exit")){
                System.out.println("退出客户端");
                dos.close();
                socket.close();
                break;
            }
            dos.flush();
        }

    }
}
