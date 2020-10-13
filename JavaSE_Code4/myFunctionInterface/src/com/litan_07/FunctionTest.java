package com.litan_07;

import java.util.function.Function;

/*
    String s = "Adam,30"
        1.将字符串截取得到数字年龄部分
        2.将上一步的年龄字符串转换为int类型的数据
        3.将上一步的int数据加70，得到一个int结果，在控制台输出
    通过Function接口来实现函数拼接
 */
public class FunctionTest {
    public static void main(String[] args) {
        String s = "Adam,30";

//        convert(s,ss -> s.split(",")[1],ss -> Integer.parseInt(ss),i -> i+70);
        convert(s,ss -> s.split(",")[1],Integer::parseInt,i -> i+70);
    }

    private static void convert(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
