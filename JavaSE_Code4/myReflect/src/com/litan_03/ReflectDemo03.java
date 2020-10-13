package com.litan_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.litan_02.Student");

        //获取一个参数的构造方法对象
        //private Student(String name)
        //Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射创建对象
        //public void setAccessible​(boolean flag)
        // 将此反射对象的accessible标志设置为指示的布尔值。
        // 值为true表示反射对象应该在使用Java语言访问控制时抑制检查
        con.setAccessible(true);

        //生成对象
        Object obj = con.newInstance("林青霞");

        System.out.println(obj);
    }
}
