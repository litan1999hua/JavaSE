package com.litan_02;
/*
    一个对象多次调用hashCode()方法，返回的哈希值相同
    默认情况下，不同对象的哈希值不相同，而通过方法重写，可以使不同对象的哈希值相同
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",35);

        //同一个对象多次调用hashCode()方法，返回的哈希值相同
        System.out.println(s1.hashCode());//1163157884
        System.out.println(s1.hashCode());//1163157884
        System.out.println("--------");

        Student s2 = new Student("林青霞",35);
        //默认情况下，不同对象的哈希值不相同
        //通过方法重写，可以使不同对象的哈希值相同
        System.out.println(s2.hashCode());//1956725890
        System.out.println("--------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("world".hashCode());//113318802
        System.out.println("--------");

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
