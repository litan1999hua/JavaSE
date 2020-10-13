package com.litan_02;

import java.io.IOException;
import java.net.*;

/*
`   UDP发送数据的步骤
        1.创建发送端 的Socket对象(DatagramSocket)  此类表示用于发送和接收数据报数据包的套接字。
        2.创建数据，并把数据打包
        3.调用 DatagramSocket对象发送数据的方法发送数据
        4.关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //DatagramSocket​() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket​(byte[] buf, int length, InetAddress address, int port)
        // 构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号
        byte[] bys = "UDP,发送数据，Java".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.119");
//        int port = 10086;//0-65535
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("36.5.200.156"),10086);

        //调用 DatagramSocket对象发送数据的方法发送数据
        //void send​(DatagramPacket p) 从此套接字发送数据报包。
        ds.send(dp);

        //关闭发送端
//        void close​() 关闭此数据报套接字。
        ds.close();
    }
}
