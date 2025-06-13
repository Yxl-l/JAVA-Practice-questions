package com.yxl.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Text3 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8080);
        byte[] bytes=new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true) {
            socket.receive(packet);
            int len = packet.getLength();
            String data = new String(bytes, 0, len);
            System.out.println("收到" + data);
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方ip" + ip + "对方端口" + port);
            if (data.equals("exit")){
                System.out.println("服务端关闭");
                socket.close();
                break;
            }
            System.out.println("---------------------------------------");
        }
    }
}
