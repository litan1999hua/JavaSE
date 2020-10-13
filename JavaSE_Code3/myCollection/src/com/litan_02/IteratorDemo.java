package com.litan_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    迭代器，集合的专用遍历方式
        Iterator<E> iterator():

    Iterator中常用方法
        E next（）：返回迭代中的下一个元素
        boolean hasNext():如果迭代具有更多元素，则返回true

 */
public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator():
        Iterator<String> it = c.iterator();
        /*
            public Iterator<E> iterator() {
                return new Itr();
            }

            private class Itr implements Iterator<E> {
            }
         */

        //E next（）：返回迭代中的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());//NoSuchElementException 被各种访问器方法抛出，表示被请求的元素不存在。
        */

        //boolean hasNext():如果迭代具有更多元素，则返回true

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
