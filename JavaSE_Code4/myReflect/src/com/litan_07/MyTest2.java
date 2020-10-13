package com.litan_07;

import java.util.stream.Stream;

public class MyTest2 {

    public static void main(String[] args) {

        UserController userController = new UserController();
        //获取class对象
        Class<? extends UserController> clazz = userController.getClass();
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            //获取属性是否有注解.
            Autowired annotation = field.getAnnotation(Autowired.class);
            if (annotation != null) {
                field.setAccessible(true);
                //获取当前属性的类型，有了类型之后创建具体对象
                Class<?> type = field.getType();
                //创建对象
                try {
                    Object o = type.newInstance();
                    field.set(userController, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
