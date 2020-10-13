package com.litan_01;
/*
    需求：启动一个线程，在控制台输出一句话：多线程程序启动了
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //实现类的方式实现需求
//        MyRunnable mr = new MyRunnable();
//        Thread t = new Thread(mr);
//        t.start();

        //匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类实现多线程程序的启动");
//            }
//        }
//        ).start();


        //Lambda表达式方式改进
        new Thread( () -> {
            System.out.println("Lambda表达式启动多线程程序");
        }
        ).start();
    }
}
