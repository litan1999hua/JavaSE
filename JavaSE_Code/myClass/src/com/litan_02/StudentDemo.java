package com.litan_02;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        System.out.println(s);
        //使用成员变量
        System.out.println(s.name);
        System.out.println(s.old);

        s.name = "张三";
        s.old = 100;

        System.out.println(s.name);
        System.out.println(s.old);
        //使用成员方法
        s.study();
        s.doHomework();
    }
}
