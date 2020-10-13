package com.litan;
/*
    需求：设计一个方法，比用比较两个数组的内容是否相同
    返回值：boolean
    参数：int[] arr,int[] arr2
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        boolean result = compare(arr,arr2);
        System.out.println(result);
    }

    public static boolean compare(int[] arr,int[] arr2) {
        if (arr.length == arr2.length) {
            for (int x = 0; x < arr.length; x++) {
                if (arr[x] != arr2[x]) {
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
