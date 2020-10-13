package com.litan_03;
/*
    练习二：
        1.定义一个接口(Flyable)，里面定义一个抽象方法 void fly(String s);
        2.定义一个测试类FlyableDemo,在测试类中提供两个方法
            useFlyable(Flyable f)
            main,在主方法中调用useFlyableDemo()方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyableDemo()方法
        Flyable f = new FlyableImpl();
        useFlyable(f);

        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机也会飞");
            }
        });

        //Lambda表达式
        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("飞机也会飞");
        });
    }

    private static void useFlyable(Flyable f){
        f.fly("老鹰会飞");
    }
}
