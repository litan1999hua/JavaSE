package com.litan_04;
/*
    练习三：
        1.定义一个接口Addable，里面定义一个抽象方法int add(int x,int y);
        2.定义一个测试类AddableDemo,在测试类中提供两个方法
            useAddable(Addable a)
            main,在主方法中调用useAddable()方法
 */
public class AddableDemo {
    public static void main(String[] args) {
        //实现类
        Addable a = new AddableImpl();
        useAddable(a);

        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        //Lambda表达式
        useAddable( (int x,int y) -> {
            return x + y;
        });
    }

    private static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
