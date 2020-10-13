package com.litan_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/*
    点名器:
        创建字符缓冲输入流对象
        创建集合对象
        读数据
        释放资源
        使用Random产生一个随机数，随机数的范围在[0,集合的长度)
        把产生的随机数作为索引到array中获取值
        输出结果
 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //读数据
        String line;
        while((line = br.readLine()) != null){
            array.add(line);
        }

        //释放资源
        br.close();

        //使用Random产生一个随机数，随机数的范围在[0,集合的长度)
        Random r = new Random();
        int index = r.nextInt(array.size());

        //把产生的随机数作为索引到array中获取值
        String name = array.get(index);

        //输出结果
        System.out.println(name + "你真幸运！");
    }
}
