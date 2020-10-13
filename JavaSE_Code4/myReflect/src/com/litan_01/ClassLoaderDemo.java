package com.litan_01;
/*
    static ClassLoader getSystemClassLoader​()
    返回用于委派的系统类加载器。

    ClassLoader getParent​()
    返回父类加载器进行委派。
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        //static ClassLoader getSystemClassLoader​()
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);

        //ClassLoader getParent​()
        ClassLoader c2 = c.getParent();
        System.out.println(c2);

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);
    }
}
