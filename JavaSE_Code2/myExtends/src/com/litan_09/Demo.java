package com.litan_09;

public class Demo {
    public static void main(String[] args) {
        //创建老师类对象测试
        Teacher t1 = new Teacher();
        t1.setName("李白");
        t1.setAge(20);
        System.out.println(t1.getName() + "，" + t1.getAge());
        t1.tech();

        Teacher t2 = new Teacher("杜甫",33);
        System.out.println(t2.getName() + "，" + t2.getAge());
        t2.tech();

    }
}
