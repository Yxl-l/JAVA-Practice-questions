package com.yxl.demo06;

import java.io.*;
import java.net.Socket;

public class TCPServerHandler extends Thread{

    private Socket socket;

    public TCPServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //调用Socket的getInputStream获取输入流，通过它获取数据
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);

            // 写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println(); // 必须换一行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='utf-8'>");
            ps.println("<title>");
            ps.println("黑马程序员");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>听黑马讲师讲Java</h1>");
            // 响应一个黑马程序员的log展示
            ps.println("<img src='https://img2.baidu.com/it/u=3861723532,3176837490&fm=253&fmt=auto&app=120&f=JPEG?w=667&h=500'>");
            ps.println("</body>");
            ps.println("</html>");

            //HTTP协议简称短连接  请求一次，断开一次
            ps.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
