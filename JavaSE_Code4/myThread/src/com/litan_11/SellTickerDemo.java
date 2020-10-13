package com.litan_11;

/*
    Lock接口
        void lock​() 获得锁。
        void unlock​() 释放锁。

    实现类ReentrantLock​() 创建一个 ReentrantLock的实例。
 */
public class SellTickerDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
