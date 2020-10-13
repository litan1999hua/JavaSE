package com.litan_02;

public class Student {
    //非静态成员变量
    private String name = "张三";
    //静态成员变量
    private static String university = "加里顿大学";


    //非静态成员方法
    public void show1(){
        System.out.println("静态成员方法只能访问静态成员");
    }

    //非静态成员方法
    //能访问静态成员变量
    //能访问静态成员方法
    //能访问非静态成员变量
    //能访问非静态成员方法
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show4();
    }

    //静态成员方法
    // 能访问静态成员
    // 不能访问非静态成员
//    public static void show3(){
//        System.out.println(name);
//        System.out.println(university);
//        show1();
//        show4();
//    }

    //静态成员方法
    public static void show4(){

    }
}
