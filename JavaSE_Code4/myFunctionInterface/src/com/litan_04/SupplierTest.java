package com.litan_04;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {155,136,89,12,800};

        int maxValue = getMax(() -> {
            int max = arr[0];

            for(int  i = 1;i < arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            return max;
        });

        System.out.println(maxValue);
    }

    //返回数组中的最大值
    private static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
