package com.litan_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
    创建字符缓冲输入流对象
    创建集合对象
    读数据
    往集合中添加数据
    释放资源
    遍历集合
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //读数据
        String line;
        while((line = br.readLine()) != null){
            //往集合中添加元素
            array.add(line);
        }

        //释放资源
        br.close();

        //遍历集合
        for(String s:array){
            System.out.println(s);
        }
    }
}
