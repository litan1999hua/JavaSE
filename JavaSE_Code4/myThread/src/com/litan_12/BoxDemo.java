package com.litan_12;
/*
    生产者消费者案例

    思路：
        1.定义一个奶箱类，定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
        2.生产者类：实现Runnable接口，重写run（）方法，调用存储牛奶的操作
        3.消费者类：实现Runable接口，重新run（）方法，调用获取牛奶的操作
        4.测试类：
            1.创建奶箱对象，这是共享数据区域
            2.创建生产者对象，把奶箱对象作为构造方法传递，因为在这个类中要调用存储牛奶的操作
            3.创建消费者对象，把奶箱对象作为构造方法传递，因为在这个类中要调用获取牛奶的操作
            4.创建2个线程，分别把生产者消费者对象作为构造方法参数传递
            5.启动线程
 */
public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
        Box b = new Box();

        //创建生产者对象，把奶箱对象作为构造方法传递，因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);

        //创建消费者对象，把奶箱对象作为构造方法传递，因为在这个类中要调用获取牛奶的操作
        Customer c= new Customer(b);

        //创建2个线程，分别把生产者消费者对象作为构造方法参数传递
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();
    }
}
