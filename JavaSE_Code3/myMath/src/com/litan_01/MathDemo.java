package com.litan_01;
/*
    Math类的常用方法
 */
public class MathDemo {
    public static void main(String[] args) {
        //public static int abs(int a);返回参数的绝对值
        System.out.println(Math.abs(-4454));

        //public static double ceil(double a);返回大于等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(3.75));

        //public static double floor(double a);返回小于等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(3.12));

        //public static int round(float a);按照四舍五入返回最接近的参数int
        System.out.println(Math.round(5.499F));

        //public static int max(int a,int b);返回两个int值中的较大值
        System.out.println(Math.max(5,6));

        //public staic int min(int a,int b);返回两个int值中的较小值
        System.out.println(Math.min(5,6));

        //public staic double pow(double a,double b);返回a的b次幂
        System.out.println(Math.pow(2.0,10.0));

        //public staic double random();返回值为double的正值，[0,2)
        System.out.println((int)(Math.random()*100) + 1);
    }
}
