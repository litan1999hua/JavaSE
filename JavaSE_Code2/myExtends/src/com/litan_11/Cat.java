package com.litan_11;

public class Cat extends Animals {

    public  Cat(){}

    public  Cat(String name,int age){
        super(name,age);
    }

    public void CatchMice(){
        System.out.println("猫抓老鼠");
    }

}
