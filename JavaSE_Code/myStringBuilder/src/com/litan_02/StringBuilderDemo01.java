package com.litan_02;
/*
    StringBuilder添加反转方法
        public StringBuilder append(任意类型) 添加数据并返回对象本身
        public StringBuilder reverse() 返回相反的字符序列
 */

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //创建可变字符串对象
        StringBuilder sb = new StringBuilder("hello");

//        //public StringBuilder append(任意类型) 添加数据并返回对象本身
//        StringBuilder sb2 = sb1.append("world");
//        System.out.println("sb1:" + sb1);
//        System.out.println("sb2:" + sb2);
//
//        //public StringBuilder reverse() 返回相反的字符序列
//        StringBuilder sb3 = sb2.reverse();
//        System.out.println("sb2:" + sb2);
//        System.out.println("sb3:" + sb3);
        //链式编程
        sb.append("world").append("Java").append(100);
        System.out.println("sb:" + sb);
        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
