package com.litan_01;
/*
    Set:
        不包含重复的元素
    HashSet对集合的迭代顺序不做任何保证
 */
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");

        for(String s:set){
            System.out.println(s);
        }
    }
}
