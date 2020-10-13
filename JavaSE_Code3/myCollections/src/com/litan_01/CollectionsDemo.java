package com.litan_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    public static <T extends Comparable<? super T>> void sort​(List<T> list)根据其元素的natural ordering ，将指定的列表按升序排
    public static void reverse​(List<?> list)反转指定列表中元素的顺序。
    public static void shuffle​(List<?> list)使用默认的随机源随机排列指定的列表。
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);

        //public static <T extends Comparable<? super T>> void sort​(List<T> list)根据其元素的natural ordering ，将指定的列表按升序排
//        Collections.sort(list);

        //public static void reverse​(List<?> list)反转指定列表中元素的顺序。
//        Collections.reverse(list);

        //public static void shuffle​(List<?> list)使用默认的随机源随机排列指定的列表。
        Collections.shuffle(list);

        System.out.println(list);
    }
}
