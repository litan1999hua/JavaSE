package com.litan_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：把ArrayList集合中的数据写入到文本文档，要求：每一个学生对象的数据作为文件中的一行数据
          格式：学号，姓名，年龄，居住地         举例：hfut001，林青霞，30，西安

    思路：
        1.定义学生类
        2.创建ArrayList集合对象
        3.创建学生对象
        4.往集合中添加学生对象
        5.创建字符缓冲输出流对象
        6.遍历集合得到每一个学生对象
        7.把学生对象的数据拼接成字符串
        8.写数据
        9.释放资源
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("hfut001","林青霞",30,"西安");
        Student s2 = new Student("hfut002","周润发",40,"香港");
        Student s3 = new Student("hfut003","周星驰",33,"九龙");
        Student s4 = new Student("hfut004","刘德华",38,"新界");


        //往集合中添加学生对象
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\students.txt"));

        //遍历集合得到每一个学生对象
        for(Student s:array){
            //把学生对象的数据拼接成字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSno()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            String ss = sb.toString();

            //写数据
            bw.write(ss);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
