package com.litan_07;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyTest {

    public static void main(String[] args) throws Exception{

        UserController userController = new UserController();
        UserService userService = new UserService();
        //UserService aa = new UserService();
        System.out.println(userService);
        //System.out.println(aa);
        System.out.println("--------");
        //完成注入功能
        Class<? extends UserController> clazz = userController.getClass();
        //获取属性
        Field service = clazz.getDeclaredField("userService");
        //设置访问属性
        service.setAccessible(true);
        System.out.println(service);
        //获取set方法
        String name = service.getName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());//UserService

        String methodName = "set" + name;
        Method method = clazz.getMethod(methodName,UserService.class);
        //调用setUserService的方法
        method.invoke(userController, userService);
        //method.invoke(userController, aa);
        System.out.println(userController.getUserService());
        //System.out.println(userController.getUserService());

    }
}
