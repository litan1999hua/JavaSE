package com.litan_02;
/*
    在子类中访问一个变量
        1.子类局部范围找
        2.子类成员范围找
        3.父类成员范围找
        4.没有报错
 */
public class Zi extends Fu {
    //身高
    public int height = 172;

    //年龄
    public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //报错
//        System.out.println(weight);
    }
}
