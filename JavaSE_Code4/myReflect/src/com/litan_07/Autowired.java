package com.litan_07;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)// 当前注解生效范围
@Target(ElementType.FIELD)// 作用范围
@Inherited// 是否有继承
@Documented// 是否文档注释里
public @interface Autowired {
}
