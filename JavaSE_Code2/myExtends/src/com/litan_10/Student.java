package com.litan_10;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("学习？学个屁！");
    }
}
