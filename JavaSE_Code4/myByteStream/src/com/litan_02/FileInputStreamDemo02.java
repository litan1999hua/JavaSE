package com.litan_02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read​(byte[] b) 从该输入流读取最多 b.length个字节的数据到一个字节数组。
        /*
        byte[] b = new byte[5];

        //第一次读取数据
        int len = fis.read(b);
        System.out.println(len);
        //String​(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
        System.out.println(new String(b,0,len));

        //第二次读取数据
        len = fis.read(b);
        System.out.println(len);
        System.out.println(new String(b,0,len));;

        //第三次读取数据
        len = fis.read(b);
        System.out.println(len);
        // String​(byte[] bytes, int offset, int length)
        System.out.println(new String(b,0,len));

        //第四次读取数据
        len = fis.read(b);
        System.out.println(len);*/

        byte[] bytes = new byte[1024];//1024及其整数倍
        int len;
        while((len = fis.read(bytes))!= -1){
            System.out.print(new String(bytes,0,len));
        }

        /*
            hello
            world

            第一次读取：hello
            第二次：\r \n wor
            第三次:ld \r \nr
         */

        //释放资源
        fis.close();
    }
}
