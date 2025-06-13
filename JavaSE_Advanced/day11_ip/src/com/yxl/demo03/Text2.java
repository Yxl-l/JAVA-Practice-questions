package com.yxl.demo03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Text2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9999);
        Socket s = socket.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int id = dis.readInt();
        String msg = dis.readUTF();
        System.out.println("id:"+id+" 收到的msg："+msg);

        System.out.println(socket.getInetAddress().getHostAddress());
        System.out.println(socket.getLocalPort());

        dis.close();
        socket.close();

    }
}
