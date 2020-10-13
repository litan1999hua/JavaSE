package com.litan_03;

public class ConverterDemo {
    public static void main(String[] args) {
//        useConverter((String s) -> {
//            return Integer.parseInt(s);
//        });

        useConverter( s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法替代的时候，他的形式参数全部传递给静态方法作为参数
    }

    private static void useConverter(Converter c){
        int number = c.Convert("666");
        System.out.println(number);
    }
}
