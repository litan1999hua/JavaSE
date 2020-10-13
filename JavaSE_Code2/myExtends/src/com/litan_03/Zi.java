package com.litan_03;
/*
    super关键字和this关键字用法相似
        this:代表本类对象的引用
        super:代表父类存储空间的标识（可以理解为父类对象的引用）
 */
public class Zi extends Fu {
    public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);

        //访问本类的成员变量
        System.out.println(this.age);

        //访问父类的成员变量
        System.out.println(super.age);

    }
}
