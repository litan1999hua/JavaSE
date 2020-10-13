package com.litan_01;

public class StaticDemo {
    public static void main(String[] args) {
        //通过类名调用给静态成员赋值
        Student.university = "加里顿大学";

        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 35;
//        s1.university = "加里顿大学";
        s1.show();

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 33;
//        s2.university = "加里顿大学";
        s2.show();
    }
}
