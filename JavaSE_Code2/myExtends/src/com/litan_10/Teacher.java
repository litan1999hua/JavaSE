package com.litan_10;

public class Teacher extends Person {
    public Teacher(){}

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void tech(){
        System.out.println("叫家长");
    }
}
