package com.litan_01;
/*
    测试类
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //接口多态
        Jumpping j = new Cat();
        j.jump();

    }
}
