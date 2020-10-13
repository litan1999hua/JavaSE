package com.litan_15;

public class TerminateThread {

    public static void main(String[] args) throws InterruptedException{
//        Thread t = new ThreadImpl1();
//        t.start();

//        Thread t = new ThreadImpl2();
//        t.start();
//        ((ThreadImpl2) t).flag = true;

        Thread t = new ThreadImpl3();
        t.start();
        t.interrupt();
        if (t.isInterrupted())
            System.out.println("线程被中断");

//        Thread t = new ThreadImpl4();
//        t.start();
//        t.interrupt();
    }

    static class ThreadImpl1 extends Thread {
        private static double value = 0;
        int i = 0, j = 0;

        @Override
        public void run() {
            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之前， value = " + value);
            while (i++ < Integer.MAX_VALUE)
                while (j++ < Integer.MAX_VALUE)
                    value += 0.1;
            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之后， value = " + value);
        }
    }

    static class ThreadImpl2 extends Thread {
        private static double value = 0;
        public volatile boolean flag = false;
        int i = 0, j = 0;
        @Override
        public void run() {
            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之前， value = " + value);
            while (i++ < Integer.MAX_VALUE && !flag)
                while (j++ < Integer.MAX_VALUE && !flag)
                value += 0.1;
            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之后， value = " + value);
        }
    }

    static class ThreadImpl3 extends Thread {
        public static double value = 0;
        int i = 0, j = 0;

        @Override
        public void run() {
            try {
                System.out.println("线程 " + Thread.currentThread().getName() + " 执行之前， value = " + value);
                while (i++ < Integer.MAX_VALUE) {
                    while (j++ < Integer.MAX_VALUE) {
                        value += 0.1;
                        Thread.sleep(1000);
                    }
                }
                System.out.println("线程 " + Thread.currentThread().getName() + " 执行之后， value = " + value);
            } catch (InterruptedException e) {
                System.out.println("发生中断时， value = " + value);
                e.printStackTrace();
            }
        }
    }

    static class ThreadImpl4 extends Thread {
        public static double value = 0;
        int i = 0;

        @Override
        public void run() {

            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之前， value = " + value);
            while (i++ < Integer.MAX_VALUE) {
                value += 0.1;
            }
            System.out.println("线程 " + Thread.currentThread().getName() + " 执行之后， value = " + value);
            if (this.isInterrupted()) {
                System.out.println("线程被中断");
                return;
            }
        }
    }
}
