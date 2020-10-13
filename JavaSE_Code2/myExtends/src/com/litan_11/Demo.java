package com.litan_11;

public class Demo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(3);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.CatchMice();

        Cat c2 = new Cat("加菲",4);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.CatchMice();

    }
}
