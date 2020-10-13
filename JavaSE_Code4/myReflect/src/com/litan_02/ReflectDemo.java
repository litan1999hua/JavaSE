package com.litan_02;
/*
   三种方式获取Class对象
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的属性来获取（类名.class）
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("--------");

        //getClass()方法
        Student s  = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3);
        System.out.println("--------");

        //Class中的静态方法forName(String className)
        Class<?> c4 = Class.forName("com.litan_02.Student");
        System.out.println(c1 == c4);
    }
}
