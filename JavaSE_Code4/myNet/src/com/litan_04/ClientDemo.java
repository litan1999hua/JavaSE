package com.litan_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP发送数据的步骤：
        1.创建客户端的Socket对象
        2.获取输出流，写数据
        3.释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        //Socket​(InetAddress address, int port) 创建流套接字并将其连接到指定IP地址的指定端口号。
//        Socket socket = new Socket(InetAddress.getByName("192.168.1.119"),10000);
        //Socket​(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s = new Socket("192.168.1.119",10000);

        //获取输出流，写数据
        //OutputStream getOutputStream​() 返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,TCP,数据".getBytes());

        //释放资源
        s.close();
    }
}
