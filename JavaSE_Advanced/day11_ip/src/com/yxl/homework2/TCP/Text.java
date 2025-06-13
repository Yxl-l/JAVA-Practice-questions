package com.yxl.homework2.TCP;

import com.yxl.homework.demo03.TPCTread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Text {
    private static ThreadPoolExecutor pool = new ThreadPoolExecutor(
            3,5,10, TimeUnit.DAYS,new ArrayBlockingQueue<>(15));
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(9999);
        while (true){
            Socket socket = ss.accept();
            pool.execute(new TPCTread(socket));
        }

    }
}
