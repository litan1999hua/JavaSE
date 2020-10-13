package com.litan_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理
 */
public class FileOutStreamDemo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("Z:\\myByteStream\\fos.txt");
            fos = new FileOutputStream("myByteStream\\fos.txt");
            fos.write("hello".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
