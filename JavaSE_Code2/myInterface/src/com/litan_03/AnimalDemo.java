package com.litan_03;

public class AnimalDemo {
    public static void main(String[] args) {
        //接口多态
        Jumpping  j = new Cat();
        j.jump();

        //抽象类多态
        Animal a = new Cat("Tom",5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("--------");

        //同时使用接口和抽象类时，用具体的子类实现
        Cat c = new Cat();
        c.setName("Tom");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
        System.out.println("--------");

        Dog d = new Dog("huihui",6);
        System.out.println(d.getName() + "," + d.getAge());
        d.jump();
        d.eat();
    }
}
