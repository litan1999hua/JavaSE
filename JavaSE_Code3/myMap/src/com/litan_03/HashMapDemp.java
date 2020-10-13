package com.litan_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：创建一个HashMap集合，键是学号（String），值是学生对象（Student）。存储三个键值对象，并遍历

    思路：
        1.定义学生类
        2.创建HashMap对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历
 */
public class HashMapDemp {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<String,Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("林青霞",35);
        Student s2 = new Student("成龙",40);
        Student s3 = new Student("周星驰",37);

        //把学生添加到集合
        hm.put("hfut001",s1);
        hm.put("hfut002",s2);
        hm.put("hfut003",s3);

        //遍历—键找值
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

        //遍历—键值对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for(Map.Entry<String, Student> me:entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
