package com.litan_10;

public class Demo {
    public static void main(String[] args) {
        //创建对象
        Teacher t1 = new Teacher();
        t1.setName("李白");
        t1.setAge(20);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.tech();

        Teacher t2 = new Teacher("杜甫",18);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.tech();

        Student s1 = new Student();
        s1.setName("李商隐");
        s1.setAge(20);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();

        Student s2 = new Student("杜牧",17);
        System.out.println(s2.getName() + "," + s2.getAge());
        s2.study();
    }
}
