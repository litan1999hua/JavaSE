package com.litan_01;

import java.io.File;
import java.io.IOException;

/*
    boolean createNewFile?() 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        如果文件不存在就创造文件并返回true，
        如果文件存在就不创建，返回false。

    boolean mkdir?() 创建由此抽象路径名命名的目录。
        如果目录不存在就创造文件并返回true，
        如果目录存在就不创建，返回false。

    boolean mkdirs?() 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
        如果目录不存在就创造文件并返回true，
        如果目录存在就不创建，返回false。
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\javazuoye目录下创建一个文件java.txt
        File f1 = new File("E:\\java\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("-------");

        //需求2：我要在E:\\javazuoye目录下创建一个目录JavaSE
        File f2 = new File("E:\\java\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("-------");

        //需求3：我要在E:\\javazuoye目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("E:\\java\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("-------");

        //需求3：我要在E:\\javazuoye目录下创建一个文件javase.txt
        File f4 = new File("E:\\java\\javase.txt");
        System.out.println(f4.createNewFile());
    }
}
