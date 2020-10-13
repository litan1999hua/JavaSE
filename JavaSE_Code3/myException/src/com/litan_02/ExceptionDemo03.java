package com.litan_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    编译时异常:受检异常，必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：RuntimeException类及其子类的实例，非受检异常，无需显示处理，也可同上
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
//        method();
        method2();
    }

    //编译时异常
    public static void method2(){
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException p){
            p.printStackTrace();
        }
    }

    //运行时异常
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
