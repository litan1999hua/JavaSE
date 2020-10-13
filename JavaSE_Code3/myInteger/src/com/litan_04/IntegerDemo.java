package com.litan_04;
/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型

    Integer ii = 100;//自动装箱 Integer.valueOf(100);
     ii += 200;//自动拆箱 ii.intValue() 自动装箱Integer.valueOf(300);

     在使用包装类类型时，如果做操作，最好先判断是否为null
     只要是对象，在使用前必须判断
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        Integer ii = 100;//自动装箱 Integer.valueOf(100);

        //拆箱：把包装类类型转换为对应的基本数据类型
        //ii += 200;
//        ii = ii.intValue() + 200;
        ii += 200;//自动拆箱 ii.intValue() 自动装箱Integer.valueOf(300);
        System.out.println(ii);

        Integer iii = null;
        if(iii != null) {
            iii += 300;//NullPointerException
        }

    }
}
