package com.litan_05;

public class MyStringDemo {
    public static void main(String[] args) {
//          useMyString((String s,int x,int y) -> {
//              return s.substring(x,y);
//          });

          useMyString((s,x,y) -> s.substring(x,y));

          //应用类中的实例方法
        useMyString(String::substring);

        //Lambda表达式被类的实例方法替代的时候，它的第一个参数作为调用者，后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(MyString my){
        String s = my.mySubString("HelloWorldJava", 0, 5);
        System.out.println(s);
    }
}
