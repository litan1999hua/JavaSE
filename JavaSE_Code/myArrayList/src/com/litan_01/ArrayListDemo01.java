package com.litan_01;
import java.util.ArrayList;
/*
    ArrayList构造方法
        public ArrayList();创建一个空的集合对象

    ArrayList添加方法
        public boolean add(E e);将指定的元素加到集合末尾,返回是否加入
        public void add(int index,E element);在指定位置插入指定的元素
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList构造方法
        //        public ArrayList();创建一个空的集合对象
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("arr:" + arr);

        //public boolean add(E e);将指定的元素加到集合末尾
        arr.add("litan");
        arr.add("2017212112");
        System.out.println("arr:" + arr);

        //public void add(int index,E element);在指定位置插入指定的元素
        arr.add(0,"hfut");
        System.out.println("arr:" + arr);
        arr.add(3,"EIE");
        System.out.println("arr:" + arr);
    }
}
