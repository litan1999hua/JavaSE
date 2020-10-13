package com.litan_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    1.字节流写数据如何实现呢？
        windows:\r\n
        Linux:\n
        mac:\r
    2.字节流写数据如何实现追加写入呢？
        public FileOutputStream​(String name,boolean append)throws FileNotFoundException
        创建文件输出流以指定的名称写入文件。 如果第二个参数为true ，则字节将写入文件的末尾而不是开头。
 */
public class FileOutStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt",true);

        //写数据
        for(int i = 0;i < 10;i++){
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
