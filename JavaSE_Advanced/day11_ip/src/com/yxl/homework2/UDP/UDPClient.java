package com.yxl.homework2.UDP;

import javax.sql.DataSource;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args)throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        while (true){
            String s = sc.next();
            byte [] bytes = s.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);
            socket.send(packet);
            if (s.equals("exit")){
                System.out.println("关闭客户端");
                socket.close();
                break;
            }
        }


    }
}
