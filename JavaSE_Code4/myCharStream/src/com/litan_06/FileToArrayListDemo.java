package com.litan_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    1.定义学生类
    2.创建字符缓冲输入流对象
    3.创建集合
    4.用字符缓冲输入流的方法读取数据
    5.把读取到的数据使用split()进行分割，得到每一个字符串数组
    6.创建学生对象
    7.把字符串数组中的每一个元素取出来赋值给学生对象的成员变量
    8.释放资源
    9.遍历集合
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\students.txt"));

        //创建集合
        ArrayList<Student> array = new ArrayList<Student>();

        //读数据
        String line;
        while ((line = br.readLine()) != null){
            //用split（）方法进行分割，得到每一个字符串数组
            String[] strArray = line.split(",");

            //创建学生对象
            Student s = new Student();

            //把字符串数组中的每一个元素取出来赋值给学生对象的成员变量
            s.setSno(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);

            //添加到集合
            array.add(s);
        }

        //释放资源
        br.close();

        //遍历集合
        for(Student s:array){
            System.out.println(s.getSno() + "," +s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
