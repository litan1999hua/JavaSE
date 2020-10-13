package com.litan_05;
/*
    方式二：实现Runnable接口
        1.定义一个类MyRunnable实现Runnable接口
        2.在MyRunnable重写run方法
        3.创建MyRunnable类对象
        4.创建Thread类对象，把MyRunnable类对象作为参数传递
        5.启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建MyRunnable类对象
        MyRunnable my = new MyRunnable();

        //创建Thread类对象，把MyRunnable类对象作为参数传递
        // public Thread​(Runnable target)分配一个新的Thread对象。
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);

        //Thread​(Runnable target, String name) 分配一个新的 Thread对象
        Thread t1 = new Thread(my,"高铁");
        Thread t2 = new Thread(my,"飞机");

        //启动线程
        t1.start();
        t2.start();
    }
}
