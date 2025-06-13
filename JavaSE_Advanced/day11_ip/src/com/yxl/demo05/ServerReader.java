package com.yxl.demo05;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReader extends Thread{
   private  Socket socket ;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true){
                String mgs = dis.readUTF();
                System.out.println("收到的msg：" + mgs);
                System.out.println("客户端id" + socket.getInetAddress().getHostAddress());
                System.out.println("客户端端口" + socket.getLocalPort());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
