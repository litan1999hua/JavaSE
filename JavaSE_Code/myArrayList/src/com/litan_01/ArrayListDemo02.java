package com.litan_01;
import java.util.ArrayList;
/*
    public boolean add(E e);将指定的元素加到集合末尾,返回是否加入
    public void add(int index,E element);在指定位置插入指定的元素
    public boolean remove(Object 0);    删除指定的元素，返回删除是否成功
    public E remove(int index);         删除指定索引的元素，返回删除的元素
    pubilc E set(int index,E element);  修改指定位置的元素，返回被修改的元素
    public E get(int index);            返回指定位置的元素
    public int size();                  返回集合元素的个数
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();

        //public boolean add(E e);将指定的元素加到集合末尾,返回是否加入
        array.add("hfut");
        array.add("litan");
        array.add("2017212112");

        //public void add(int index,E element);在指定位置插入指定的元素
        array.add(1,"EIE");
        array.add(0,"adadad");
        System.out.println("array:" + array);

        //public boolean remove(Object 0);    删除指定的元素，返回删除是否成功
        System.out.println(array.remove("adada"));
        System.out.println(array.remove("adadad"));
        array.add(0,"adadad");

        //public E remove(int index);         删除指定索引的元素，返回删除的元素
        System.out.println(array.remove(0));
        array.add(0,"adadad");

        //pubilc E set(int index,E element);  修改指定位置的元素，返回被修改的元素
        System.out.println(array.set(0,"AnHui"));

        //public E get(int index);            返回指定位置的元素
        System.out.println(array.get(0));
        System.out.println(array.get(4));

        //public int size();                  返回集合元素的个数
        System.out.println(array.size());
    }
}
