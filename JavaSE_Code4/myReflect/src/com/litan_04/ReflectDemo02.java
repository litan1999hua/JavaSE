package com.litan_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取class对象
        Class<?> c = Class.forName("com.litan_02.Student");


        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

//        Field nameField = c.getField("name");//NoSuchFieldException
        Field nameField = c.getDeclaredField("name");
        //暴力反射
        nameField.setAccessible(true);
        nameField.set(obj,"林青霞");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,30);
        System.out.println(obj);

        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj,"西安");
        System.out.println(obj);
    }
}
