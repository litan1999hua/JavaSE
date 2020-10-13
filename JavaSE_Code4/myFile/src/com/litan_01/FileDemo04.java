package com.litan_01;

import java.io.File;
import java.io.IOException;

/*
    boolean delete():删除由此抽象路径名表示的文件或目录
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("E:\\java\\java.txt");
        //需求1：在当前模块目录下创建java.txt文件
        File f1 = new File("myfile\\java.txt");
//        System.out.println(f1.createNewFile());

        //需求2：删除当前模块目录下java.txt文件
        System.out.println(f1.delete());
        System.out.println("--------");

        //需求3：在当前模块目录下创建itcast目录
        File f2 = new File("myFile\\itcast");
//        System.out.println(f2.mkdir());

        //需求4：删除当前模块目录下itcast目录
        System.out.println(f2.delete());
        System.out.println("--------");

        //需求5：在当前模块目录下创建itcast目录，然后再该目录下创建一个文件java.txt
        File f3 = new File("myFile\\itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("myFile\\itcast\\java.txt");
//        System.out.println(f4.createNewFile());绯荤粺鎵句笉鍒版寚瀹氱殑璺緞銆�

        //需求6：删除当前模块目录下itcast目录
        System.out.println(f4.delete());
        System.out.println(f3.delete());

    }
}
