package com.litan_09;

public class Student {
    //定义成员变量
    private String name;
    private int age;

    //定义一个无参构造方法，，
    public Student() {

    }

    //定义一个带多种参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //set/get成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //show方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
