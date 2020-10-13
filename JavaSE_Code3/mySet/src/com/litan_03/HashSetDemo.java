package com.litan_03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        hs.add("world");

         //遍历
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------");
        for(String s:hs){
            System.out.println(s);
        }
    }
}
