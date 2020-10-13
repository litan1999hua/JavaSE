package com.litan_01;
/*
    需求：
        1.定义一个接口，里面有两个抽象方法
        2.定义接口的两个实现类
        3.定义测试类
            在主方法中，按照多态的形式创建对象并使用
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        //按照多态的形式创建对象并使用
        MyInterface miOne = new MyInterfaceImplOne();
        miOne.show1();
        miOne.show2();
        miOne.show3();

        MyInterface miTwo = new MyInterfaceImplTwo();
        miTwo.show1();
        miTwo.show2();
    }
}
