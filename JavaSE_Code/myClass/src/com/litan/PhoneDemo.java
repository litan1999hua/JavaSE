package com.litan;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //成员变量的使用
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);
        //成员方法的使用
        p.call();
        p.sendMessage();
    }
}
