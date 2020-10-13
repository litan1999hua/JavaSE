package com.litan_03;

public abstract class Animal {

    private int age = 20;
    private final String city = "北京";

    public Animal(){}

    public Animal(int age){
        this.age = age;
    }

    public void show(){
        age = 40;
//        city = "上海";
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
