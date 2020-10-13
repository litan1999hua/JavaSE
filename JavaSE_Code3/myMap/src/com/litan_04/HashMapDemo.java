package com.litan_04;

import java.util.HashMap;
import java.util.Set;

/*
    需求：创建一个HashMap对象，键是学生对象，值是居住地。存储多个键值对元素，并遍历
          要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象。
    思路：
        1.定义学生类
        2.创建集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合
        6.在学生类中重写两个方法来保证键的唯一性
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Student,String> hm = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("林青霞",35);
        Student s2 = new Student("成龙",40);
        Student s3 = new Student("周星驰",37);
        Student s4 = new Student("周星驰",37);

        //把学生添加到集合
        hm.put(s1,"香港");
        hm.put(s2,"HongKong");
        hm.put(s3,"九龙");
        hm.put(s4,"新界");

        //遍历集合
        Set<Student> keySet = hm.keySet();
        for(Student key:keySet){
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
