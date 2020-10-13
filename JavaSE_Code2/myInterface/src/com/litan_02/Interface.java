package com.litan_02;

public interface Interface {
    //接口中的成员变量只能是常量，并且被静态修饰 public static final
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;

    //接口里的方法默认带了 public abstract

//    public Interface(){}

//    public void show(){}

    public abstract void method();

    void show();
}
