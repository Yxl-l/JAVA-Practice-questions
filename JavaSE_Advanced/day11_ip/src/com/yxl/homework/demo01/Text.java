package com.yxl.homework.demo01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Text {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(8080);
        byte[] bytes = new byte[64*1024];
        while (true){
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            socket.receive(packet);
            String s = new String(bytes,0,packet.getLength());
            if (s.equals("exit")){
                System.out.println("服务端关闭");
                socket.close();
                break;
            }
            System.out.println( "接收到数据"+s);
            System.out.println("对方ip"+packet.getAddress().getHostAddress());
            System.out.println("对方端口"+packet.getPort());



        }
    }
}
