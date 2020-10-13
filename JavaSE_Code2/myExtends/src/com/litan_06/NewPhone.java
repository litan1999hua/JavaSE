package com.litan_06;
/*
    新手机
 */
public class NewPhone extends Phone{
   /* public void call(String name){
        System.out.println("开启视频功能");
        super.call(name);
    }*/


   @Override
   public void call(String name){
       System.out.println("开启视频功能");
       super.call(name);
   }
}
