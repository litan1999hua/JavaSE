package com.litan_02;

public class Cat extends Animal {

    //抽象类的子类要么重写抽象类所有抽象方法，要么本身也是抽象类
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
