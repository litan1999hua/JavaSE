package com.litan_05;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("Tom");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("Tom",5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
