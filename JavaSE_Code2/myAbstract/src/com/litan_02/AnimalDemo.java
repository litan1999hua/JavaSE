package com.litan_02;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal() ;

        //抽象类多态创建对象
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
