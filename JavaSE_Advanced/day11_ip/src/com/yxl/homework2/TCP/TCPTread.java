package com.yxl.homework2.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPTread extends Thread{
    Socket socket;

    public TCPTread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true){
                String msg = dis.readUTF();

                System.out.println("收到客户端发来的"+msg);
                System.out.println("客户端ip:"+socket.getInetAddress().getHostAddress()+"端口"+socket.getPort());
                if (msg.equals("exit")){
                    System.out.println("退出服务端");
                    socket.close();
                    dis.close();
                    break;
                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
