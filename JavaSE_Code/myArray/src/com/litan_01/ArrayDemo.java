package com.litan_01;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*
            左边：
                int:说明数组中的元素类型是int类型
                []:说明数组
                arr:数组名称
            右边:
                new:为数组申请内层空间
                int:说明数组中的元素类型是int类型
                []:说明数组
                3:数组长度，元素个数
        */

        //输出数组名
        System.out.println(arr);//[I@4554617c


        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
