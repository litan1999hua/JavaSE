package com.litan_06;

public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(() -> System.out.println("好好学习天天向上"));

        //使用Lambda表达式必须要有接口，并且接口中有且仅有一个抽象方法
        useInter(() -> System.out.println("好好学习天天向上"));

        //必须要有上下文环境，才能推导出Lambda表达式中的对应接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

//        Runnable r = () -> System.out.println("Lambda表达式");
//        new Thread(r).start();

        new Thread(() -> System.out.println("Lambda表达式")).start();
    }

    public static void useInter(Inter i){
        i.show();
    }
}
