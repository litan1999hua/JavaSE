package com.litan_02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Interface i = new InterfaceImpl();
//        i.num = 20;
        System.out.println(i.num);
//        i.num2 = 40;
        System.out.println(i.num2);
        System.out.println(Interface.num);
    }
}
