package com.litan_03;

public class JumppingDemo {
    public static void main(String[] args) {
        //创建一个JumppingOperator类的对象
        JumppingOperator jo = new JumppingOperator();
        //使用多态的方式创建一个对象
        Jumpping j = new Cat();
        //调用JumppingOperator类中的useJumpping（）方法
        jo.useJumpping(j);

        //调用umppingOperator类中的getJumpping（）方法，创建一个Cat类对象j，并用一个Jumpping类的对象j2 储存
        Jumpping j2 = jo.getJumpping();
        //编译看左边，执行看右边new Cat()执行jump（）方法
        j2.jump();
    }
}
