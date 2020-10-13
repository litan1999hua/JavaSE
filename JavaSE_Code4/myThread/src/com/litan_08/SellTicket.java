package com.litan_08;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //tickets = 100
            //t1,t2,t3
            //假设t1抢到了cpu的执行权
            //假设在t1休息时t2抢到了cpu的执行权
            synchronized (obj) {
                //t1进来后就会把这段代码锁起来
                if (tickets > 0) {
                    try {
                        Thread.sleep(1);
                        //t1休息100ms
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //窗口1正在出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;//tickets = 99
                }
            }
            //t1出来后，这段代码的锁就被释放了
        }
    }
}
