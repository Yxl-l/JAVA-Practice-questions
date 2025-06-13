package com.yxl.demo03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Text1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(111);
        dos.writeUTF("我欺负祈福祈福七二七万人31");
        dos.close();
        socket.close();
    }
}
