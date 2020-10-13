package com.litan_04;

import java.io.*;

/*
    BufferedWriter
        将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
        可以指定缓冲区大小，或者可以接受默认大小。 默认值足够大，可用于大多数用途。

    BufferedReader
        从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
        可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。

    BufferedWriter​(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
    BufferedReader​(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //BufferedWriter​(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
//        FileWriter fw = new FileWriter("myCharSteam\\bw.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
//        bw.write("hello\n");
//        bw.write("world\n");
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //一次读一个字符数据
//        int ch;
//        while((ch = br.read()) != -1){
//            System.out.print((char)ch);
//        }

        //一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }
        br.close();
    }
}
