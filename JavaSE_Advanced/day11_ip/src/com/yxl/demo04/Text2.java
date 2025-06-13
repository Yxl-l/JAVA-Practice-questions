package com.yxl.demo04;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Text2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9999);
        Socket s = socket.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());

    while (true) {
        String msg = dis.readUTF();
        System.out.println("收到的msg：" + msg);
        System.out.println("客户端id" + socket.getInetAddress().getHostAddress());
        System.out.println("客户端端口" + socket.getLocalPort());
        if (msg.equals("exit")){
            System.out.println("服务端关闭");
            dis.close();
            socket.close();
            break;
        }
    }


    }
}
