package com.litan_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    数据源：myCharStream\\ConversionStreamDemo.java
    目的地：myCharStream\\Copy.java

    FileWriter(String filename) --- OutputStreamWriter 子类
    FileReader(String filename) --- InputStreamReader  子类
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //创建FileReader对象
        FileReader fr = new FileReader("myCharStream\\ConversionStreamDemo.java");

        //创建FileWriter对象
        FileWriter fw = new FileWriter("myCharStream\\Copy.java");

//        //读数据，一次读取一个字符数据
//        int chs;
//        while((chs = fr.read()) != -1){
//            //写数据
//            fw.write(chs);
//        }

        //读数据，一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }

        //释放资源
        fr.close();
        fw.close();
    }
}
