package com.litan_04;

import java.io.*;

/*
    字符缓冲流
    数据源：myCharStream\\ConversionStreamDemo.java
    目的地：myCharStream\\Copy.java
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\ConversionStreamDemo.java"));

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\Copy.java"));

        //一次读取一个字符数据
//        int ch;
//        while((ch = br.read()) != -1){
//            bw.write(ch);
//        }

        //一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }


        //释放资源
        br.close();
        bw.close();
    }
}
