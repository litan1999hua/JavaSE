package com.litan_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：Collection集合存储字符串并遍历
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);

        //遍历
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
//            Object o = it.next();
//            System.out.println(o);
            String s = it.next();//ClassCastException
            System.out.println(s);
        }
    }
}
