package com.yxl.homework.demo03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TPCTread extends Thread{
    private Socket socket;

    public TPCTread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void  run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true){
                String msg = dis.readUTF();
                if (msg.equals("exit")){
                    System.out.println("退出服务端");
                    dis.close();
                    socket.close();
                }
                System.out.println("收到客户端打来的"+msg);
                System.out.println("客户端ip"+socket.getInetAddress().getHostAddress()+"客户端端口"+socket.getPort());
            }

        } catch (IOException e) {
            System.out.println("客户端已下线");
        }
    }
}
