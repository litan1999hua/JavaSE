package com.litan_04;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() ->"林青霞");
        System.out.println(s);

        Integer i = getInteger(() -> 886);
        System.out.println(i);
    }

    //定义一个方法返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    //定义一个方法返回一个字符串数据
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
