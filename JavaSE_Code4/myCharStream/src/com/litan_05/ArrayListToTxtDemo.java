package com.litan_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
    创建ArrayList集合对象
    往集合中添加字符串元素
    创建字符缓冲输出流对象
    遍历集合，得到每一个字符串数据,写数据
    释放资源
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();

        //往集合中添加字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));

        //遍历集合，得到每一个字符串数据
        for(String s:array){
            //写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
