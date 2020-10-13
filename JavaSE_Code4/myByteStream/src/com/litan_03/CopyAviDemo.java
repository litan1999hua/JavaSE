package com.litan_03;

import java.io.*;
/*
    源地址:E:\\java\\观念.avi
    目的地:myByteStream\\观念.avi
    基本字节流一次读写一个字节       共耗时248920毫秒
    基本字节流一次读写一个字节数组   共耗时670毫秒
    字节缓冲流一次读写一个字节       共耗时1620毫秒
    字节缓冲流一次读写一个字节数组   共耗时150毫秒
 */

public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
        //基本字节流一次读写一个字节
//        method1();
        //共耗时248920毫秒

        //基本字节流一次读写一个字节数组
//        method2();
        //共耗时670毫秒

        //字节缓冲流一次读写一个字节
//        method3();
        //共耗时1620毫秒

        //字节缓冲流一次读写一个字节数组
        method4();
        //共耗时150毫秒

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时" + (endTime - startTime) + "毫秒");
    }

    //基本字节流一次读写一个字节
    public static void method1()throws IOException{
        FileInputStream fis = new FileInputStream("E:\\java\\观念.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\观念.avi");

        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\java\\观念.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\观念.avi");

        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }

    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\java\\观念.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\观念.avi"));

        int by;
        while((by = bis.read()) != -1){
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\java\\观念.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\观念.avi"));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
