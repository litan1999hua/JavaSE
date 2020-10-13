package com.litan_06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/*
    我有一个ArrayList集合，现在我想这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<Integer>();

//        array.add(10);
//        array.add(20);
//        array.add("hello");

        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.setAccessible(true);
        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");


        System.out.println(array);

    }
}
