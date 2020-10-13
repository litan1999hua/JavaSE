package com.litan_05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    <R,A> R collect​(Collector<? super T,A,R> collector)
    使用 Collector对此流的元素执行 mutable reduction操作。

        Collectors
            static <T> Collector<T,?,List<T>> toList​()
            返回一个 Collector ，将输入元素累加到一个新的 List 。

            tatic <T> Collector<T,?,Set<T>> toSet​()
            返回一个 Collector ，将输入元素累加到一个新的 Set 。

            public static Collector toMap​(Function keyMapper,Function< valueMapper)
 */
public class CollectDemo {
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<String>();
        list.add("Tom");
        list.add("Jack");
        list.add("Jackson");
        list.add("Alen");

        //需求1：得到名字为4个英文字母的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 4);

        //需求2：把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for(String name:names){
            System.out.println(name);
        }*/

        //创建set集合对象
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //需求3：得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);

        //需求4：把使用Stream流操作完毕的数据收集在Set集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for(Integer age:ages){
            System.out.println(age);
        }

        //定义一个字符串数组，每一个字符串数据有姓名和年龄组成
        String[] strArray = {"林青霞,30","成龙,35","周星驰,33","古天乐,25"};

        //需求5：得到字符串中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        //需求6：把使用Stream流操作完毕的数据收集到Map集合中，姓名是键，年龄是值
        Map<String, String> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));

        Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
