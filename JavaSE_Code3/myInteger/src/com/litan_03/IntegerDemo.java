package com.litan_03;
/*
    int和String的相互转换
    int to String  public static String valueOf(int i)返回int参数的字符串int形式
    String to int  public static int parseInt(String s)
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //int to String
        int number = 100;
        //1
        String s1 = "" + number;
        System.out.println(s1);
        //2
        //public static String valueOf(int i)返回int参数的字符串int形式
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");

        //String to int
        String s = "100";
        //1
        //String to Integer to int
        Integer i = Integer.valueOf(s);
        //public int intValue()将 Integer的值作为 int
        int i1 = i.intValue();
        System.out.println(i1);
        //2
        //String to int
        //public static int parseInt(String s)
        int i3 = Integer.parseInt(s);
        System.out.println(i3);
    }
}
