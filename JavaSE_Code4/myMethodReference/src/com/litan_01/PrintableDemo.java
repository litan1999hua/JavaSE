package com.litan_01;

public class PrintableDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法
//        usePrintable((String s) -> {
//            System.out.println(s);
//        });

        usePrintable(s -> System.out.println(s));

//        System.out.println("爱生活爱Java");

        //方法引用符：::
        usePrintable(System.out::println);

        //可推导的就是可省略的
    }

    private static void usePrintable(Printable p){
        p.printString("爱生活爱Java");
    }
}
