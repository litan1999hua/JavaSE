package com.litan_02;
import java.util.ArrayList;
/*
    需求：创建一个储存字符串的集合，存储三个字符元素，实用程序实现再控制台遍历该集合
        1.创建集合对象
        2.往集合中添加字符串对象
        3.使用for循环和 get（int index） size()方法遍历该集合
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        //往集合中添加字符串对象
        array.add("林青霞");
        array.add("周星驰");
        array.add("周润发");

        //使用for循环和 get（int index） size()方法遍历该集合
        for(int x = 0;x < array.size();x++){
            String s = array.get(x);
            System.out.println(array.get(x));
        }
    }
}
