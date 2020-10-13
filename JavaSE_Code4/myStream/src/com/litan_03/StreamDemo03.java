package com.litan_03;

import com.litan_02.StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    static <T> Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b)
    创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。

    Stream<T> distinct​() 返回由该流的不同元素（根据 Object.equals(Object) ）组成的流。
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("张角");
        list.add("张鲁");
        list.add("张文远");
        list.add("张翼德");
        list.add("张让");
        list.add("关云长");
        //需求1：取前4个元素组成一个流
        Stream<String> s1 = list.stream().limit(4);

        //需求2：跳过2个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        //需求3：合并需求1和需求2得到的流，并把结果在控制台输出
//        Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println("--------");

        //需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
