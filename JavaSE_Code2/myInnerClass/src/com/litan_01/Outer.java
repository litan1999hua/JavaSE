package com.litan_01;
/*
    内部类访问特点
        内部类可以直接访问内部类的成员，包括私有
        外部类要访问内部类的成员，必须创建对象
 */
public class Outer {

    private int name = 10;

    public class Inner{
        public void show(){
            System.out.println(name);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
