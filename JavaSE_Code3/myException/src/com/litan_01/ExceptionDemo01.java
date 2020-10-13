package com.litan_01;
/*
    异常:就是程序出现了不正常的情况

    异常体系
    Throwable:Error;Exception:RuntimeException&NoRuntimeException
    Error:严重问题，不需要处理
    Exception：成为异常类，它表示程序本身可以处理的问题
    RuntimeException:编译期间不检查，出现问题后回来修改代码
    NoRuntimeException：在编译期间就必须处理，否则程序不能通过编译，就不能正常运行
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int[] arr = {1,2,3};
//        System.out.println(arr[1]);
//        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException数组索引越界异常
        System.out.println(arr[2]);
    }
}
