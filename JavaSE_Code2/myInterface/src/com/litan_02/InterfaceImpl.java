package com.litan_02;

public class InterfaceImpl  implements Interface {
    public InterfaceImpl(){
        super();
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
