package com.litan_02;
/*
    String构造方法
        public String()：创建一个空白字符串对象，不含有任何内容
        public String(char[] chs):根据字符数组的内容，来创建字符串对象
        public String(byte[] bys):根据字节数组的内容，来创建字符串对象
        String a = "abc":使用赋值方式创建内容为“abc”的字符串对象

        推荐直接赋值创建字符串对象
 */

public class StringDemo01 {
    public static void main(String[] args) {
        //public String()：创建一个空白字符串对象，不含有任何内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        //public String(char[] chs):根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //public String(byte[] bys):根据字节数组的内容，来创建字符串对象
        byte[] bys = {85,36,69};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //String a = "abc":使用赋值方式创建内容为“abc”的字符串对象
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}
