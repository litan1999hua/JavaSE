package com.litan_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //使用多态的方式创建对象
        Collection<String> c = new ArrayList<String>();

        //添加数据  boolean add(E e)
        c.add("hello");
        c.add("world");

        System.out.println(c);

    }
}
