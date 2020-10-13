package com.litan_09;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象并用两种方式赋值
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();

        Student s2 = new Student("林青霞",30);
        s2.show();

    }
}
