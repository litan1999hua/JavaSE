package com.litan_06;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞",35);
        Student s2 = new Student("成龙",40);
        Student s3 = new Student("张曼玉",33);
        Student s4 = new Student("周星驰",37);
        Student s5 = new Student("吴京",37);
        Student s6 = new Student("吴京",37);

        //往集合中添加对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历
        for(Student s:ts){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
