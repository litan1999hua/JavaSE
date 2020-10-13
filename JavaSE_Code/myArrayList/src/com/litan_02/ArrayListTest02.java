package com.litan_02;

import java.util.ArrayList;

/*
    需求：创建一个储存学生对象的集合，存储三个学生对象，实用程序实现再控制台遍历该集合
        1.定义学生类
        2.创建存储学生对象的集合
        3.创建学生对象
        4.往集合中添加三个学生对象
        5.遍历集合
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建存储学生对象的集合
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("周星驰",25);
        Student s3 = new Student("周润发",35);

        //往集合中添加三个学生对象
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        for(int x = 0;x < array.size();x++){
            Student s = array.get(x);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
