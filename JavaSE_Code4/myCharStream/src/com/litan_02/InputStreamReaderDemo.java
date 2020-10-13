package com.litan_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    int read();
    int read(char[] chs);
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        InputStreamReader ism = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
        InputStreamReader ism = new InputStreamReader(new FileInputStream("myCharStream\\ConversionStreamDemo.java"));

        //读数据
//        int ch;
//        while((ch = ism.read()) != -1){
//            System.out.print((char)ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len = ism.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }

        //释放资源
        ism.close();
    }
}
