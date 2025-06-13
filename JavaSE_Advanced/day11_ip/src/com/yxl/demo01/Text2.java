package com.yxl.demo01;

import java.io.IOException;
import java.net.*;

public class Text2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] bytes= "蔡徐坤".getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8080);
        socket.send(packet);
        socket.close();

    }

}
