package com.litan_05;
//需求：使用方法重载的思想，涉及比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
public class MethodTest {
    public static void main(String[] args) {
        System.out.println(compare(156,894));
        System.out.println(compare((byte)156,(byte)894));
        System.out.println(compare((short) 156,(short)894));
        System.out.println(compare(156L,894L));
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a,short b){
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }

    public static boolean compare(long a,long b){
        System.out.println("long");
        return a == b;
    }
}
