package com.litan_09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端：接收到的数据写入文本文件，给出反馈

    问题：程序一直等待
    原因：读数据的方法是阻塞式的
    解决办法：自定义结束标记；shutdownOutput()方法
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
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\Copy.txt"));

        String line;
        while((line = br.readLine()) != null){//等待读取数据
//            if ("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(11111);

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        ss.close();
        bw.close();
    }
}
