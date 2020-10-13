package com.litan_03;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("张角");
        list.add("张鲁");
        list.add("张文远");
        list.add("张翼德");
        list.add("张让");
        list.add("关云长");

        //需求1：把list集合中以张开头的元素在控制台输出
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("--------");

        //需求2：把list集合中长度为3的元素在控制台输出
        list.stream().filter(s -> s.length()==3).forEach(System.out::println);
        System.out.println("--------");

        //需求3：把list集合中以张开头的，长度为3的元素在控制台输出
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() ==3).forEach(System.out::println);
    }
}
