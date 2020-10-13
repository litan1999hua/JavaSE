package com.litan_04;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞",35);
        Student s2 = new Student("成龙",40);
        Student s3 = new Student("成龙",40);

        //把学生对象添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        //遍历集合
        for(Student s:hs){
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
