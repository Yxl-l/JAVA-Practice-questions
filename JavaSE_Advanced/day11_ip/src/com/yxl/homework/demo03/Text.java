package com.yxl.homework.demo03;

import com.yxl.homework.demo02.SocketThread;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Text {
    private static ThreadPoolExecutor pool = new ThreadPoolExecutor(
            5,10,15, TimeUnit.DAYS,new ArrayBlockingQueue<>(20));
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(8080);

        while (true){
            Socket socket = ss.accept();
            System.out.println("用户上线");
            pool.execute(new TPCTread(socket));

        }

    }
}
