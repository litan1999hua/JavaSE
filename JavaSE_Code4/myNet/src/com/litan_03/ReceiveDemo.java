package com.litan_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
`   UDP接收数据的步骤
        1.创建接收端的Socket对象 DatagramSocket​(int port) 构造数据报套接字并将其绑定到本地主机上的指定端口。
        2.创建数据包用于接收数据
        3.调用 DatagramSocket对象发送数据的方法接受数据
        4.解析数据包，并在控制台显示
        5.关闭接收端

    接收端不知道发送端什么时候停止发送，采用死循环接收
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象 DatagramSocket​(int port)
        DatagramSocket ds = new DatagramSocket(10001);

        while (true) {
            //创建数据包用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用 DatagramSocket对象发送数据的方法接受数据
            ds.receive(dp);

            //解析数据包，并在控制台显示
            System.out.println("数据是" + new String(dp.getData(), 0, dp.getLength()));
        }

        //关闭接收端
//        ds.close();
    }
}
