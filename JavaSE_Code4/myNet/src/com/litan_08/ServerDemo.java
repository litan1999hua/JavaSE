package com.litan_08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端：接收到的数据写入文本文件
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端的连接，返回一个对应的Socket对象
        Socket s = ss.accept();

        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\Copy.txt"));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        ss.close();
        bw.close();
    }
}
