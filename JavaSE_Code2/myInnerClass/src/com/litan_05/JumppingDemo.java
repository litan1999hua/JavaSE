package com.litan_05;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);
        System.out.println("--------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });
    }
}
