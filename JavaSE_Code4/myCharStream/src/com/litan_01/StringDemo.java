package com.litan_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
    编码：
        byte[] getBytes()
        byte[] getBytes(String charsetName)

    解码：
        String(byte[] bytes)
        String(byte[] bytes,String charsetName)
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        //编码
//        byte[] bytes = s.getBytes();//[-28, -72, -83, -27, -101, -67]
//        byte[] bytes = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bytes = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bytes));

        //解码
        //String(byte[] bytes)
//        String ss = new String(bytes);
//        String ss = new String(bytes,"UTF-8");
        String ss = new String(bytes,"GBK");
        System.out.println(ss);
    }
}
