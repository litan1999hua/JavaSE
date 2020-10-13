package com.litan_11;

public class Dog extends Animals{
    public Dog(){}

    public Dog(String name,int age){
        super(name, age);
    }

    public void doorKeep(){
        System.out.println("狗看大门");
    }
}
