package com.litan_02;

public class IntegerDemo {
    public static void main(String[] args) {
        /*
        //public  Integer(int value);
        Integer i1 = new Integer(100);
        System.out.println(i1);

        //public  Integer(String s);
        Integer i2 = new Integer("100");//NumberFormatException
        System.out.println(i2);
*/
        //public static Integer valueOf(int i);
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //public static Integer valueOf(String s);
        Integer i2 = Integer.valueOf("abc");//NumberFormatException
        System.out.println(i2);

    }
}
