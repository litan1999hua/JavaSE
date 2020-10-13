package com.litan_02;

public class ExceptionDemo02 {
    public static void main(String[] args){
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException("xxx");
        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());//3

            System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: 3

            e.printStackTrace();
        }
    }
}

/*
    public class Throwable{
        private String detailMessage

        public Throwable(String message){
            detailMessage = message;
        }

        public String getMessage() {
        return detailMessage;
        }
    }
 */
