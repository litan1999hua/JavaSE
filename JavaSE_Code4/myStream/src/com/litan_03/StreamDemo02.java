package com.litan_03;

import java.util.ArrayList;

/*
    Stream<T> limit​(long maxSize)
    返回由此流的元素组成的流，截短长度不能超过 maxSize 。

    Stream<T> skip​(long n)
    在丢弃流的第一个 n元素后，返回由该流的剩余元素组成的流。
 */
public class StreamDemo02 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("张角");
        list.add("张鲁");
        list.add("张文远");
        list.add("张翼德");
        list.add("张让");
        list.add("关云长");

        //需求1：取前三个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("--------");

        //需求2：跳过三个元素，把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("--------");

        //需求3：跳过两个元素，把剩下的前两个元素在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
