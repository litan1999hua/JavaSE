package com.litan_11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
    Lock接口
        void lock​() 获得锁。
        void unlock​() 释放锁。

    实现类ReentrantLock​() 创建一个 ReentrantLock的实例。
 */
public class SellTicket implements Runnable {
    private static int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if(tickets > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }


}
