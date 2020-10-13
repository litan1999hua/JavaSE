package com.litan_01;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("张角");
        list.add("张鲁");
        list.add("张文远");
        list.add("张翼德");
        list.add("张让");
        list.add("关羽");

        //把集合中所有“张”开头的元素存储到一个新的集合
        ArrayList<String> zhangList = new ArrayList<String>();

        for(String s:list){
            if(s.startsWith("张")){
                zhangList.add(s);
            }
        }

        System.out.println(zhangList);

        //把所有“张”开头集合中长度为3的集合存储到一个新的集合
        ArrayList<String> zhang3List = new ArrayList<String>();
        for(String s:zhangList){
            if(s.length() == 3){
                zhang3List.add(s);
            }
        }

//        System.out.println(zhang3List);

        for(String s:zhang3List){
            System.out.println(s);
        }

        System.out.println("-------");

        //Stream流来改写
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);
    }
}
