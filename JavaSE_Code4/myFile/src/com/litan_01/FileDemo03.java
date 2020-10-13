package com.litan_01;

import java.io.File;

/*
    boolean isDirectory​() 测试此抽象路径名表示的文件是否为目录。
    boolean isFile​() 测试此抽象路径名表示的文件是否为普通文件。
    boolean exists​() 测试此抽象路径名表示的文件或目录是否存在。

    String getAbsolutePath​() 返回此抽象路径名的绝对路径名字符串。
    String getPath​() 将此抽象路径名转换为路径名字符串。
    String getName​() 返回由此抽象路径名表示的文件或目录的名称。

    String[] list​() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录
    File[] listFiles​() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
 */
public class FileDemo03 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("myFile\\java.txt");

//        boolean isDirectory​() 测试此抽象路径名表示的文件是否为目录。
//        boolean isFile​() 测试此抽象路径名表示的文件是否为普通文件。
//        boolean exists​() 测试此抽象路径名表示的文件或目录是否存在。
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

//        String getAbsolutePath​() 返回此抽象路径名的绝对路径名字符串。
//        String getPath​() 将此抽象路径名转换为路径名字符串。
//        String getName​() 返回由此抽象路径名表示的文件或目录的名称。
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("--------");

//        String[] list​() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录
//        File[] listFiles​() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File f2 = new File("E:\\java");
        String[] strArray = f2.list();
        for(String str:strArray){
            System.out.println(str);
        }
        System.out.println("--------");

        File[] fileArray = f2.listFiles();
        for(File file:fileArray){
//            System.out.println(file);
//            System.out.println(file.getName());
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
