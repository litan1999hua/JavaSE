package com.litan_01;
/*
    StringBuilder构造方法
        public StringBuilder():创建一个空白可变字符串对象，不含任何内容
        public StringBuilder(String str):根据字符串内容创建可变字符串对象
 */

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //public StringBuilder():创建一个空白可变字符串对象，不含任何内容
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:" + s1);
        System.out.println("s1.length():" + s1.length());

        //public StringBuilder(String str):根据字符串内容创建可变字符串对象
        StringBuilder s2 = new StringBuilder("hello");
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());
    }
}
