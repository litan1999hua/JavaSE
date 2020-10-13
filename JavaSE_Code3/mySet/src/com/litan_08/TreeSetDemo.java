package com.litan_08;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();

                //次要条件
                int num2 = num == 0?s1.getChinese() - s2.getChinese():num;
                int num3 = num2 == 0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("林青霞",88,98);
        Student s2 = new Student("成龙",87,90);
        Student s3 = new Student("张曼玉",92,83);
        Student s4 = new Student("周星驰",100,78);
        Student s5 = new Student("吴京",87,99);
        Student s6 = new Student("赵云",87,99);

        //往集合中添加对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历
        for(Student s:ts){
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," +s.getSum());
        }

    }
}
