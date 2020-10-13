package com.litan_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for(String s: array){
            System.out.println(s);
        }
        System.out.println("--------");

        for(int i = 0;i < array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //遍历
        for(String s: linkedList){
            System.out.println(s);
        }
        System.out.println("--------");

        for(int i = 0;i < linkedList.size();i++){
            String s = linkedList.get(i);
            System.out.println(s);
        }
        System.out.println("--------");

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
