package com.litan_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：把"E:\\java\\LOUWRE.txt"复制到模块目录下的"LOUWRE.txt"

    数据源：
        E:\\java\\LOUWRE.txt---读数据---InputStream---FileInputStream
    目的地：
        myByteStream\\LOUWRE.txt---写数据---OutputStream---FileOutputStream

    思路：
        1.根据数据源地址创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
        4.释放资源
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //创捷字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\java\\LOUWRE.txt");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\LOUWRE.txt");

        //读数据
        int by;
        while((by = fis.read()) != -1){
            //写数据
            fos.write(by);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
