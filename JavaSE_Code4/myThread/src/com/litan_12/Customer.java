package com.litan_12;
/*
    消费者类：实现Runable接口，重新run（）方法，调用获取牛奶的操作
 */
public class Customer implements Runnable{
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
