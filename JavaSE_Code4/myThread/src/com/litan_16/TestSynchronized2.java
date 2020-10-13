package com.litan_16;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSynchronized2 {

    public static class SynchronizedTest {
        private static int i = 0;

        public int getI() throws Exception {
            i++;
            Thread.sleep(100);
            return i;
        }

        public synchronized int getI1() throws Exception {
            i++;
            Thread.sleep(100);
            return i;
        }
        public synchronized int getI2() throws Exception {
            i++;
            Thread.sleep(100);
            return i;
        }
        /*
        修饰静态方法，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
        * */
        public synchronized static int getI3() throws Exception {
            i++;
            Thread.sleep(100);
            return i;
        }

        public synchronized static int getI4() throws Exception {
            i++;
            Thread.sleep(100);
            return i;
        }
//        /*
//        修饰代码块，指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁。
//        * */
//        public int getI3(Object o) throws Exception {
//            synchronized (o) {
//                i++;
//                Thread.sleep(100);
//                return i;
//            }
//        }

        public static void main(String[] args) {
            //实例化本类实例，调用普通方法是用到。
            final SynchronizedTest syt1 = new SynchronizedTest();
            final SynchronizedTest syt2 = new SynchronizedTest();
            //创建了一个最大容量为5的线程池
            ExecutorService es = Executors.newFixedThreadPool(10);
            //这里的lock对象，是用作锁代码块是用的，做为所对象  别用字符串常量做锁；锁对象引用改变，会引发change锁事件，即立即释放锁
            final Object lock = new Object();

            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {
                    es.execute(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                System.out.println(syt1.getI1());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else {
                    es.execute(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                System.out.println(syt1.getI3());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }

            }
            es.shutdown();
        }

    }
}
