package com.litan_02;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
//        //StringBulider转String  public StringBuilder toString()
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello");
//        String s = sb.toString();
//        System.out.println("s:" + s);

        //String转StringBuilder  public StringBuilder(String s)构造方法
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.println("s:" + s);
    }
}
