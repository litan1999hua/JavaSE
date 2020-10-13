package com.litan_08;

public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
//    public Student() {
//        System.out.println("无参构造方法");
//    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
