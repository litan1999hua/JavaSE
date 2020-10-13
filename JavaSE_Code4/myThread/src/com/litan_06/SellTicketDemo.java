package com.litan_06;
/*
    需求：
        某电影院100张票，三个窗口卖出，而它三个窗口卖票，请设计一个程序卖出

    思路：
        1.定义一个SellTicket类实现Runnable接口，里面定义一个成员变量：private int ticket = 100;
        2.在SellTicket类中重写Run方法实现卖票：
            1.判断ticket是否大于0，如果是，卖票，并告知窗口
            2.ticket-1
            3.用死循环实现窗口一直服务
        3.定义测试类
            1.创建SellTicket对象
            2.创建三个线程的对象，把创建SellTicket对象，窗口名作为参数
            3.启动线程
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建SellTicket对象
        SellTicket st = new SellTicket();

        //创建三个线程的对象，把创建SellTicket对象，窗口名作为参数
        Thread t1 = new Thread(st, "窗口一");
        Thread t2 = new Thread(st, "窗口二");
        Thread t3 = new Thread(st, "窗口三");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
