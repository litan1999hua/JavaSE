package com.litan_03;

import java.util.ArrayList;
/*
    Stream<T> sorted​() 返回由此流的元素组成的流，根据自然顺序排序。

    Stream<T> sorted​(Comparator<? super T> comparator)
    返回由该流的元素组成的流，根据提供的 Comparator进行排序。
 */
public class StreamDemo04 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangjiao");
        list.add("zhanglu");
        list.add("zhangwenyuan");
        list.add("zhangyide");
        list.add("zhangrang");
        list.add("guanyunchang");

        //需求1：按照字母顺序把数据在控制台输出
//        list.stream().sorted().forEach(System.out::println);

        //需求2：按照字符串长度把数据在控制台输出
//        list.stream().sorted((s1,s2) -> s1.length() - s2.length()).forEach(System.out::println);
        list.stream().sorted((s1,s2) ->{
            int num = s1.length() - s2.length();
            int num2 = num == 0?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);
    }
}
