package com.litan_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        //创建对象list
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element)
        list.add(0,"litan");
//        list.add(5,"litan");//IndexOutOfBoundsException: Index: 5, Size: 4

        //E remove(int index)
//        System.out.println(list.remove(0));

        //E set(int index,E element)
//        System.out.println(list.set(0,"2017212112"));

        //E get(int index)
        System.out.println(list.get(0));

//        //输出集合对象
//        System.out.println(list);

        //通过迭代器遍历输出集合对象
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
