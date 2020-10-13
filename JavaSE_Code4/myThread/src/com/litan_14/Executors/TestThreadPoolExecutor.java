package com.litan_14.Executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPoolExecutor {

    public static void main(String[] args) {
        //创建数组型缓冲等待队列
        BlockingQueue<Runnable> bq = new ArrayBlockingQueue<>(10);

        //ThreadPoolExecutor: 创建自定义线程池，池中保存的线程数为3，允许的最大线程数为6
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3, 6, 50, TimeUnit.MILLISECONDS, bq);

        //创建三个任务
        Runnable t1 = new TempThread();
        Runnable t2 = new TempThread();
        Runnable t3 = new TempThread();

        //三个任务分别在线程池上执行
        tpe.execute(t1);
        tpe.execute(t2);
        tpe.execute(t3);

        //关闭自定义线程池
        tpe.shutdown();

    }


    static class TempThread implements Runnable {

        @Override
        public void run() {
            //打印正在执行的缓存线程信息
            System.out.println(Thread.currentThread().getName() + "正在被执行");
            try {
                // sleep一秒保证三个任务分别在三个线程上执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
