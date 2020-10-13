package com.litan_03;
/*
    需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法
          并在控制台输出结果。例如，数组为int[] arr= {1,2,3},输出结果为[1,2,3]
          1.定义一个int类型的数组，用静态初始化完成数组元素的初始化
          2.定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
            返回值类型：String,参数：int[] arr
          3.在方法中遍历数组，按照要求进行拼接
          4.调用方法，用一个变量接受结果
          5.输出结果
 */

public class StringTest04 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {12,13,14,15};

        //调用方法，用一个变量接受结果
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s:" + s);
    }

    //定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
    //            返回值类型：String,参数：int[] arr
    public static String arrayToString(int[] arr){
        //在方法中遍历数组，按照要求进行拼接
        String s = "";
        s += "[";
        for(int x = 0;x < arr.length;x++){
            if(x == arr.length - 1){
                s += (arr[x] + "]");
            }else{
                s += (arr[x] + ", ");
            }
        }
        return s;
    }
}
