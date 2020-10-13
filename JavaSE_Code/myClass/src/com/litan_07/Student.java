package com.litan_07;

public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法");
    }
    public void show(){
        System.out.println(name + "," + age);
    }
}
