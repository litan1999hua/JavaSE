package com.litan_16;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class TestSynchronized1 {

    public static class Account1 {
        /**
         * 账户类
         */
        private static volatile int count = 100;

        public synchronized void add(int m) {
            String name = Thread.currentThread().getName();
            System.out.println("对象锁添加" + m + "钱，" + name + "添加后：" + (count += m));
        }

        public synchronized void mul(int m) {
            String name = Thread.currentThread().getName();
            System.out.println("对象锁减少" + m + "钱，" + name + "消费后：" + (count -= m));
        }
    }


    public static class Account2 {
        /**
         * 账户类
         */
        private static int count = 100;

        public static synchronized void add(int m) {
            String name = Thread.currentThread().getName();
            System.out.println("类锁添加" + m + "钱，" + name + "添加后：" + (count += m));
        }

        public static synchronized void mul(int m) {
            String name = Thread.currentThread().getName();
            System.out.println("类锁减少" + m + "钱，" + name + "消费后：" + (count -= m));
        }
    }


    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4);
        Account1 suo = new Account1();
        Account1 suo1 = new Account1();
        for (int i = 0; i < 4; i++) {
            int n = i + 1;
            int j = n * 3;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000 * (new Random().nextInt(8)));
                        System.out.println("线程" + n + "准备好了");
                        barrier.await();
                        if (n == 1 || n == 3)
                            suo.add(j);//1,3
                        else
                            suo1.mul(j);//2,4
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }, "线程" + i).start();
        }
    }
}
