package com.litan_02;
/*
    函数式接口作为方法参数
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        //Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
    }

    private static void startThread(Runnable r){
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();
    }
}
