package com.litan_03;

import java.io.*;

/*
`   字节缓冲流：
        BufferedOutputStream
        BufferedInpouStream

    构造方法
        字节缓冲输入流：BufferedOutputStream(OutputStream out)
        字节缓冲输出流：BufferedInputStream(InputStream out)
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输入流：BufferedOutputStream(OutputStream out)
//        FileOutputStream fos = new FileOutputStream("myByteStream\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        /*
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\bos.txt"));

        //写数据
        bos.write("hello\n".getBytes());
        bos.write("world\n".getBytes());

        //释放资源
        bos.close();
        */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\bos.txt"));

        //读数据
        /*int by;
        while((by = bis.read()) != -1){
            System.out.print((char)by);
        }*/

        //一次读取一个字节数组的数据
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len));
        }

        //释放资源
        bis.close();
    }
}
