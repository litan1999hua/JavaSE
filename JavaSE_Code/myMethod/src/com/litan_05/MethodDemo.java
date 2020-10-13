package com.litan_05;

/*
    多个方法的参数不相同，类型不相同或数量不相同

    与返回值无关
    在调用的时候Java虚拟机会通过参数的不同来区分同名的方法
*/
public class MethodDemo {
    public static void main(String[] args) {
        int result = sum(10, 59);
        System.out.println(result);

        double result2 = sum(10.5, 159.569);
        System.out.println(result2);

        int result3 = sum(15, 98, 56);
        System.out.println(result3);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
