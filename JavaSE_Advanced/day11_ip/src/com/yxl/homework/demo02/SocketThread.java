package com.yxl.homework.demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketThread extends Thread {
    private Socket socket ;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true){
                String msg = dis.readUTF();
                if (msg.equals("exit")){
                    System.out.println("退出服务端");
                    dis.close();
                    socket.close();
                    break;
                }
                System.out.println("收到客户端发来的"+msg);
                System.out.println("客户端ip:"+socket.getInetAddress().getHostAddress()+"端口"+socket.getPort());
            }

        } catch (IOException e) {
            System.out.println(Thread.currentThread().getName()+"用户下线了");
        }

    }

}
