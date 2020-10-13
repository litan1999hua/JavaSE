package com.litan_03;

import java.util.ArrayList;

/*
    void forEach​(Consumer<? super T> action) 对此流的每个元素执行操作。

    long count​() 返回此流中的元素数。
 */
public class StreamDemo06 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("张角");
        list.add("张鲁");
        list.add("张文远");
        list.add("张翼德");
        list.add("张让");
        list.add("关云长");

        //需求1：把集合中的元素输出在控制台
        list.stream().forEach(System.out::println);

        //需求2：统计集合中有几个张开头的元素，并把统计结果输出在控制台
        long number = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(number);
    }
}
