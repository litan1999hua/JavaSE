package com.litan_06;

/*
在SellTicket类中重写Run方法实现卖票：
            1.判断ticket是否大于0，如果是，卖票，并告知窗口
            2.ticket-1
            3.用死循环实现窗口一直服务
 */
public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
