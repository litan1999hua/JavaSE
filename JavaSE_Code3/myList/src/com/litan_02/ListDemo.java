package com.litan_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("Tom",25);
        Student s2 = new Student("成龙", 45);
        Student s3 = new Student("赵本山",35);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        //迭代器遍历
//        Iterator<Student> it = list.iterator();
//        while(it.hasNext()){
//            Student s = it.next();
//            System.out.println(s.getName() + "," + s.getAge());
//        }

        //for循环遍历
        for(int i = 0;i < list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
