package com.litan_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
    FileOutputStream​(File file) 创建文件输出流以写入由指定的 File对象表示的文件。

    void write​(int b) 将指定的字节写入此文件输出流。
    void write​(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流。
    void write​(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。

    void close​() 关闭此文件输出流并释放与此流相关联的任何系统资源。
 */
public class FileOutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        //new File(name)
//        FileOutputStream fos = new FileOutputStream(new File("myByteFile\\fos.txt"));

        //FileOutputStream​(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
//        File file = new File("myByteFile\\fos.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos2 = new FileOutputStream(new File("myByteFile\\fos.txt"));

        //void write​(int b) 将指定的字节写入此文件输出流。
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        //void write​(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流。
//        byte[] b = {97, 98, 99, 100, 101};
        //byte[] getBytes​() 使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中。
        byte[] bytes = "abcde".getBytes();
//        fos.write(bytes);

        //void write​(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。
        fos.write(bytes,0,bytes.length-1);

        //释放系统资源
        fos.close();

    }
}
