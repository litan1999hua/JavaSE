package com.litan_10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端：接收到的数据写入文本文件，给出反馈,写入文本文件，代码用线程进行封装，为每一个客户端开启一个线程。

 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的ServerSocket对象
        ServerSocket ss= new ServerSocket(9999);

        while (true) {
            //监听客户端的连接，返回一个对应的Socket对象
            Socket s = ss.accept();
            //为每一个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }
    }
}
