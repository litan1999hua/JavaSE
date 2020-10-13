package com.litan_04;

import java.io.*;

/*
    字符缓冲流
    数据源：myCharStream\\ConversionStreamDemo.java
    目的地：myCharStream\\Copy.java
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\ConversionStreamDemo.java"));

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\Copy.java"));

        //读数据
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        bw.close();
    }
}
