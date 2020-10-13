package com.litan_03;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void doorKeep(){
        System.out.println("狗看大门");
    }
}
