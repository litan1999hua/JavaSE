package com.litan_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.litan_02.Student");

        //public Student(String name, int age, String address)
        //getConstructor​(Class<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过.classs得到对应的class类型

        //T newInstance​(Object... initargs)
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
