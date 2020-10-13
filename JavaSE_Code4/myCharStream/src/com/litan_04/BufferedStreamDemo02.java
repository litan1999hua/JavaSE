package com.litan_04;

import java.io.*;

/*
    字符缓冲流的特有功能
        BufferedStreamWriter:
            void newline():写一行行分隔符，行分隔符字符串由系统属性定义

        BufferedStreamReader:
            public String readline();
            结果包含行的内容的字符串，不包括任何终止字符，如果流的结尾已经到达，则为null
 */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("MyCharStream\\bw.txt"));

        //写数据
        for(int i = 0;i < 10;i++){
            bw.write("hello" + i);
//            bw.write("\n");
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
        */

        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("MyCharStream\\bw.txt"));

        //一次读一行数据
        //public String readline();
        //            结果包含行的内容的字符串，不包括任何终止字符，如果流的结尾已经到达，则为null
       /*
       //第一次读取数据
        String line = br.readLine();
        System.out.println(line);

        //第二次读取数据
        line = br.readLine();
        System.out.println(line);

        //第三，四次读取数据
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        */

       String line;
       while((line = br.readLine()) != null){
           System.out.println(line);
       }


        //释放资源
        br.close();
    }
}
