package com.litan_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();


        //创建学生对象
        Student s1 = new Student("Tom",25);
        Student s2 = new Student("jack",28);
        Student s3 = new Student("Jackson",30);

        //往集合中添加学生对象
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //三种方式便利
        //迭代器
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //for
        for(int i = 0;i < list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //增强for
        for(Student s:list){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
