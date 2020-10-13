package com.litan_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
`   UDP发送数据的步骤
        1.创建发送端 的Socket对象(DatagramSocket)  此类表示用于发送和接收数据报数据包的套接字。
        2.创建数据，并把数据打包
        3.调用 DatagramSocket对象发送数据的方法发送数据
        4.关闭发送端

    UDP发送数据:
        数据来自键盘录入，直到输入的数据是996，发送数据结束
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            //输入的数据是996
            if("996".equals(line)){
                break;
            }

            //创建数据包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.119"),10001);

            //调用发送数据的方法
            ds.send(dp);
        }

        //关闭发送端
        ds.close();
    }
}
