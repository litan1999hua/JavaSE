package com.litan_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建对象
        Collection<String> c = new ArrayList<String>();

        //boolean add(E e);
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o);
//        System.out.println(c.remove("world"));
//        System.out.println(c.remove("sss"));

        //void clear()
//        c.clear();

        //boolean contains(Object o)
        System.out.println(c.contains("world"));

        //boolean isEmpty():
        System.out.println(c.isEmpty());

        //int size()
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);

        //
    }
}
