package com.litan_04;
/*
    匿名内部类
    new 类名或接口名（）{
        重写方法;
    };
    一个继承了该类或者实现了该接口的子类匿名对象
 */
public class Outer {

    public void method(){
        /*new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/

        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();
    }
}
