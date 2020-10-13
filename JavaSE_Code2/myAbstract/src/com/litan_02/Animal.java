package com.litan_02;
/*
    抽象类
    有抽象方法必须是抽象类
    抽象类里不一定有抽象方法
 */
public abstract class Animal {
    //抽象方法
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
