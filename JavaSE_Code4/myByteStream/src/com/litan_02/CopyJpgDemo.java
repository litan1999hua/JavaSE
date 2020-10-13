package com.litan_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    1.根据数据源创建字节输入流对象
    2.根据目的地创建字节输出流对象
    3.读写数据，复制图片（一次读一个字节数组，一次写一个字节数组）
    4.释放资源
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\java\\LOUWRE.jpg");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\LOUWRE.jpg");

        //读数据
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1){
            //void write​(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。
            fos.write(bytes,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
