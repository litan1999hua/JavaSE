package com.litan_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    ListIterator列表迭代器
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> lit = list.listIterator();
//        while(lit.hasNext()){
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("--------");
//
//        while(lit.hasPrevious()){
//            String ss = lit.previous();
//            System.out.println(ss);
//        }

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }

        System.out.println(list);
    }
}
