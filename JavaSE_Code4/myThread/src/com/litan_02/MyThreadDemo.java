package com.litan_02;
/*
    获取和设置线程名称的方法
        void setName(String name):将此线程的名称更改为等于参数name
        String getName():返回此线程的名称
 */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        //void setName(String name):将此线程的名称更改为等于参数name
//        my1.setName("时间");
//        my2.setName("沙漏");

        //Thread​(String name) 分配一个新的 Thread对象。
        MyThread my1 = new MyThread("高铁");
        MyThread my2 = new MyThread("飞机");
//
        my1.start();
        my2.start();

/*        //static Thread currentThread​() 返回对当前正在执行的线程对象的引用。
        System.out.println(Thread.currentThread().getName());*/
    }
}
