package com.litan_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器端：接收数据，给出反馈
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept​() 监听客户端的连接
        Socket s = ss.accept();

        //获取输入流，读数据,并显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器:" + data);

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());

        //释放资源
        s.close();
        ss.close();
    }
}
