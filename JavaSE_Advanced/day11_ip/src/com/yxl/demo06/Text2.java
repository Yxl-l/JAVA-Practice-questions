package com.yxl.demo06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Text2 {
    public static ExecutorService pool = new ThreadPoolExecutor(
            5,10,15, TimeUnit.DAYS,new ArrayBlockingQueue<>(15));
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);



    while (true) {
        Socket socket  = ss.accept();
        System.out.println("一个客户端上线了"+socket.getInetAddress().getHostAddress());
        pool.execute(new TCPServerHandler(socket));

    }


    }
}
