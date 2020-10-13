package com.litan_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤：
        1.创建客户端的ServerSocket对象
        2.监听客户端连接，返回一个Socket对象
        3.获取输入流，读数据并显示在控制台
        4.释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的ServerSocket对象
        //ServerSocket​(int port) 创建绑定到指定端口的服务器套接字。
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept​() 侦听要连接到此套接字并接受它。
        Socket s = ss.accept();

        //获取输入流，读数据并显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("数据是：" + data);

        //释放资源
        s.close();
        ss.close();
    }
}
