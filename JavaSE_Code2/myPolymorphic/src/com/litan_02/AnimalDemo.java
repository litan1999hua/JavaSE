package com.litan_02;
/*
    测试类
    成员变量编译看左边，执行看左边
    成员方法编译看左边，执行看右边
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);

       a.eat();
//       a.playGame();
    }
}
