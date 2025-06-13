package com.yxl.demo01;

import java.io.IOException;
import java.net.InetAddress;


public class Text01 {
    public static void main(String[] args) throws IOException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip2.isReachable(5000));

    }
}
