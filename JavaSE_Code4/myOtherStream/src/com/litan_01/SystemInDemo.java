package com.litan_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        //public static final InputStream in:
//        InputStream is = System.in;
//
////        int by;
////        while((by = is.read()) != -1){
////            System.out.print((char)by);
////        }
//
//        //字节流转换为字符流?用转换流
//        InputStreamReader isr = new InputStreamReader(is);
//
//        //字符缓冲输入流一次都一行
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是：" + line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是：" + i);

        //自己实现键盘录入数据太麻烦，所以提供一个类使用
        Scanner sc = new Scanner(System.in);


    }
}
