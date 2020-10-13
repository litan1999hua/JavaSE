package com.litan_10;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自文本文件,接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("36.5.200.156",9999);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("myNet\\InetAddressDemo.java"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();//禁用此套接字的输出流。 对于TCP套接字，任何先前写入的数据将被发送，随后是TCP的正常连接终止序列

        //接收服务器反馈
       BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
       String data = brClient.readLine();
       System.out.println("服务器的反馈:" + data);

        //释放资源
        s.close();
        bw.close();
    }
}
