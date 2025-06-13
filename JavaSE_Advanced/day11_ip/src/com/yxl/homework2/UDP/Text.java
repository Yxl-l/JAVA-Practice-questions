package com.yxl.homework2.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Text {
    public static void main(String[] args) throws Exception{
        byte[] bytes = new byte[1024*64];
        DatagramSocket socket = new DatagramSocket(8080);
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        while (true){
            socket.receive(packet);
            String s = new String(bytes,0,packet.getLength());
            System.out.println( "接收到数据"+s);
            System.out.println("对方ip"+packet.getAddress().getHostAddress());
            System.out.println("对方端口"+packet.getPort());
            if (s.equals("exit")){
                System.out.println("服务端关闭");
                socket.close();
                break;
            }

        }
    }
}
