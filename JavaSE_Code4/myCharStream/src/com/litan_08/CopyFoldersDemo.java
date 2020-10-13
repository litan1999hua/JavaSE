package com.litan_08;

import java.io.*;

/*
    复制多级文件夹
    把e盘的java复制到d盘下

    1.创建数据源File对象，E:\\java
    2.创建目的地File对象  D:\\
    3.写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
    4.判断数据源File是否是目录
        是：
            在目的地的下创建和数据源File名称一样的目录
            获取数据源File下所有文件或者目录的File数组
            遍历该File数组，得到每一个File对象
            把该File作为数据源File对象，递归调用复制文件夹的方法
        不是：说明是文件，用字节流复制

 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源File对象，E:\\java
        File srcFile = new File("E:\\java");

        //创建目的地File对象  D:\\
        File destFile = new File("D:\\");

        //写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile,destFile);


    }

    //复制文件夹
    public static void copyFolder(File srcFile, File destFile) throws IOException{
        //判断数据源File是否是目录
        if(srcFile.isDirectory()){
            //在目的地下创建和File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);//D:\\java
            if(!newFolder.exists()){
                newFolder.mkdir();
            }

            //获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            //遍历该File数组，得到每一个File对象
            for(File file:fileArray){
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file,newFolder);
            }
        }else{
            //用字节流复制
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    //定义一个方法，用字节缓冲流复制文件
    public static void copyFile(File srcFile,File destFile)throws IOException{
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
