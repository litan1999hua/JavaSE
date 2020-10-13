package com.litan_03;

import java.io.*;

/*
    数据源：myCharStream\\ConversionStreamDemo.java
    目的地：myCharStream\\Copy.java
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        InputStreamReader ism = new InputStreamReader(new FileInputStream("myCharStream\\ConversionStreamDemo.java"));

        //创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\Copy.java"));

        //读数据,一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = ism.read(chs)) != -1){
            //写数据
            osw.write(chs,0,len);
        }

        //释放资源
        ism.close();
        osw.close();
    }
}
