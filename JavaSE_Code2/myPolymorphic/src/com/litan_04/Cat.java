package com.litan_04;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫戏老鼠");
    }
}
