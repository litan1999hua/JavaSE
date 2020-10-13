package com.litan_08;

/*
    解决多线程数据安全问题
        是否多线程
        是否共享数据
        是否多条语句操作共享数据
    如何解决多线程安全问题
        让程序没有安全问题的环境
    怎么实现呢
        把多条语句操作共享数据的代码锁起来，任意时刻只有一个线程执行操作
        Java提供了同步代码块的方式来解决
        synchronized(任意对象){
            多条语句操作共享数据的代码
        }
        synchronized相当于给这对代码加锁了，这里的任意对象就是锁
 */
public class SellTicketDemo {
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
