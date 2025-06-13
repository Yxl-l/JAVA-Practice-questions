package com.yxl.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true){
            String msg = sc.next();

            byte[] bytes=msg.getBytes("UTF-8");
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8080);
            socket.send(packet);
            if (msg.equals("exit")){
                System.out.println("客户端退出");
                socket.close();
                break;
            }

        }


    }

}
