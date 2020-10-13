package com.litan_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    字符流写数据的五种方式：
        void write(int c)
        void write(char[] cbuf)
        void write(char[] cbuf,int off,int len)
        void write(String str)
        void write(String str,int off,int len)
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));

        //void write(int c)
//        osw.write(97);
//        //void flush​() 刷新流。
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);

        //void write(char[] cbuf)
        char[] chs = {'a','b','c','d','e'};
//        osw.write(chs);

        //void write(char[] cbuf,int off,int len)
//        osw.write(chs,0,chs.length-1);

        //void write(String str)
        String s = "我爱中国";
//        osw.write(s);
        osw.write(s,0,s.length()-1);

        //释放资源
        osw.close();
//        osw.write(100);//IOException: Stream closed
    }
}
