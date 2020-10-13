package com.litan_07;

public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
//        //相同的票出现了多次
//        //tickets = 100
//        //t1,t2,t3
//        //假设t1抢到cpu执行权
//        while (true) {
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息100ms
//                    //t2线程抢到了cpu的执行权，t2线程就开始执行，执行到这里的时候，t2线程也休息100ms
//                    //t3线程抢到了cpu的执行权，t3线程就开始执行，执行到这里的时候，t3线程也休息100ms
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //假设线程按照顺序醒来
//                //t1先抢到cpu的执行权，在控制台输出窗口1正在出售第100张票
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                //t2先抢到cpu的执行权，在控制台输出窗口2正在出售第100张票
//                //t3先抢到cpu的执行权，在控制台输出窗口3正在出售第100张票
//                tickets--;
//                //如果三个线程还是按照顺序执行，这里执行三次--操作，票变成了97
//            }
//        }

        //出现了负数的情况
        while (true) {
            //tickets = 1
            //t1,t2,t3
            //假设t1抢到cpu执行权
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                    //t1线程休息100ms
                    //t2线程抢到了cpu的执行权，t2线程就开始执行，执行到这里的时候，t2线程也休息100ms
                    //t3线程抢到了cpu的执行权，t3线程就开始执行，执行到这里的时候，t3线程也休息100ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒来
                //t1抢到cpu的执行权，在控制台输出窗口1正在出售第1张票
                //t1继续拥有cpu的执行权，执行tickets--，这时候tickets=0;
                //t2抢到cpu的执行权，在控制台输出窗口2正在出售第0张票
                //t2继续拥有cpu的执行权，执行tickets--，这时候tickets=-1;
                //t3抢到cpu的执行权，在控制台输出窗口3正在出售第-1张票
                //t3继续拥有cpu的执行权，执行tickets--，这时候tickets=-2;
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
