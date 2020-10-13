package com.litan_07;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this --- s
                //s1 --- s2
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });//TreeSet(Comparator<? super E> comparator)

        //创建学生对象
        Student s1 = new Student("aa",15);
        Student s2 = new Student("bb",18);
        Student s3 = new Student("ff",13);
        Student s4 = new Student("rr",12);
        Student s5 = new Student("dd",11);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历集合
        for(Student s:ts){
            System.out.println(s.getName() + "," +s.getAge());
        }
    }
}
