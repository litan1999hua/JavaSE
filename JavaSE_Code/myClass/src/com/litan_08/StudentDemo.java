package com.litan_08;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("林青霞");
        s2.show();

        Student s3 = new Student(30);
        s3.show();

        Student s4 = new Student("林青霞",30);
        s4.show();
    }
}
