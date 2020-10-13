package com.litan_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节流读文本文件

    一个汉字的存储：
        如果是GBK编码，占用两个字节
        如果是UTF-8编码，占用三个字节
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("myCharStream\\a.txt");
//
//        int by;
//        while((by = fis.read()) != -1){
//            System.out.print((char)by);
//        }
//
//        fis.close();
//        String s = "abc";//[97, 98, 99]
        String s = "中国";//[-28, -72, -83, -27, -101, -67]
//        byte[] bytes = s.getBytes();
//        byte[] bytes = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bytes = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bytes));
    }
}
