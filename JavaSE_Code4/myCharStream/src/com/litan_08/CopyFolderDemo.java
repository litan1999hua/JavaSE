package com.litan_08;

import java.io.*;

/*
    需求：把E:\\java 这个文件夹复制到模块目录下

    思路：
        1.创建数据源目录的File对象，路径是E:\\java
        2.获取数据源目录File对象的名称（java）
        3.创建目的地目录File对象，路径名是myCharStream\\java
        4.判断目的地目录是否有对应File存在，如果不存在，就创建
        5.获取数据源目录下的所有File数组
        6.遍历File数组，得到每一个File对象，该File对象其实就是数据源文件
        7.获取数据源文件的名称
        8.创建目的地文件File对象
        9.复制文件（有图片视频，字节流）
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源目录的File对象，路径是E:\\java
        File srcFolder = new File("E:\\java");

        //获取数据源目录File对象的名称（java）
        String srcFolderName = srcFolder.getName();

       //创建目的地目录File对象，路径名是myCharStream\\java
        File destFolder = new File("myCharStream",srcFolderName);

        //判断目的地目录是否有对应File存在，如果不存在，就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        //获取数据源目录下的所有File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象
        for(File srcfile:listFiles){
            //获取数据源文件的名称
            String srcfileName = srcfile.getName();

            //创建目的地文件File对象
            File destFile = new File(destFolder,srcfileName);

            //复制文件
            CopyFile(srcfile,destFile);
        }
    }

    //定义一个方法，用字节缓冲流复制文件
    public static void CopyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
