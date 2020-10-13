package com.litan_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("Tom");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        Animal a1 = new Dog("huihui",5);
        System.out.println(a1.getName() + "," + a1.getAge());
        a1.eat();
    }
}
