package com.litan;
/*
    类的定义步骤：
                定义类
                编写类的成员变量
                编写类的成员方法
    手机类：
        类名：
        手机

        成员变量：
        品牌
        价格

        成员方法
        打电话
        发短信

 */
public class Phone {
    String brand;
    int price;

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
