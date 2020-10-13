package com.litan_03;
/*
    public final int getPriority();
    public final void setPriority(int newPriority)
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

//        System.out.println(tp1.getPriority());//5
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5

        //public final void setPriority(int newPriority)
//        tp1.setPriority(1000);//IllegalArgumentException

        //设置优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
