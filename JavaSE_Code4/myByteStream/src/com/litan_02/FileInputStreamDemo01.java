package com.litan_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
    FileInputStream​(String name) 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
    int read​() 从该输入流读取一个字节的数据。
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");

        //调用字节输入流读数据的方法
        //int read​() 从该输入流读取一个字节的数据。

        /*
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        */

        //如果到文件末尾，返回值-1
        /*
        int by = fis.read();
        while(by != -1){
            System.out.print((char)by);
            by = fis.read();
        }
        */

        //优化上面的程序
        int by;
        /*
            fis.read()读数据
            by = fis.read()把读取到的数据赋值给by变量
            by ！= -1，判断读取到的数据是否是-1
         */
        while((by = fis.read()) != -1){
            System.out.print((char)by);
        }

        //释放资源
        fis.close();
    }
}
