package com.litan_09;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
//
//        linkedList.add("hello");
//        linkedList.add("world");
//        linkedList.add("java");
//
//
//        linkedList.addFirst("javase");
//        linkedList.addLast("javaee");
//
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());
//
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());
//
//        System.out.println(linkedList);
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
    }
}
