package com.litan_09;
/*
    同步方法：就是把synchornized关键字加到方法上

    修饰符 synchornized 返回值类型 方法名 参数(方法参数){}

    同步方法的锁对象是什么呢？this

    同步静态方法：就是把synchornized关键字加到静态方法上

    修饰符 static synchornized 返回值类型 方法名 参数(方法参数){}

    同步方法的锁对象是什么呢？类名.class
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
