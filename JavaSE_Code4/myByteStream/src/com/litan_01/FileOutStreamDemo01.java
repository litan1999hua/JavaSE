package com.litan_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
    void write​(int b) 将指定的字节写入此文件输出流。
    void close​() 关闭此文件输出流并释放与此流相关联的任何系统资源。
 */
public class FileOutStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        /*
            完成三个功能
            1.调用系统功能创建文件
            2.创建字节输出流对象
            3.让字节输出流对象指向创建好的文件
         */
        //void write​(int b) 将指定的字节写入此文件输出流
        fos.write(97);
//        fos.write(57);
//        fos.write(55);

        //最后都要释放资源
        //void close​() 关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();

    }
}
