package com.litan_05;

import com.litan_02.Student;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> c = Class.forName("com.litan_02.Student");

//        Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj,"林青霞");

        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        System.out.println(o);

        Method f = c.getDeclaredMethod("function");
        f.setAccessible(true);
        f.invoke(obj);
    }
}
