package com.litan_08;

import java.util.ArrayList;
import java.util.Iterator;

/*
    ArrayList集合存储学生对象用三种方式遍历
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞",35);
        Student s2 = new Student("张国荣",40);
        Student s3 = new Student("周星驰",33);

        //往集合中添加学生对象
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //三种方式遍历
        //迭代器
        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //for
        for(int i = 0;i < array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //增强for
        for(Student s:array){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
