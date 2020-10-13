package com.litan_07;

public class Zi extends Fu{

    /*@Override
    private void show(){
        System.out.println("Zi中show()方法被调用");
    }*/
    //父类中私有方法子类不能继承

    /*@Override
    public void method(){
        System.out.println("Zi中method()方法被调用");
    }*/

    @Override
      void method(){
        super.method();
        System.out.println("Zi中method()方法被调用");
    }

    //子类重写父类方法时，访问权限不比父类低
}
