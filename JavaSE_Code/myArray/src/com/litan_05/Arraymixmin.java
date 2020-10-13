package com.litan_05;

public class Arraymixmin {
    public static void main(String[] args) {
        int[] arr = {13, 86, 26, 99, 46};
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (max <arr[x]) {
                max = arr[x];
            }
        }
        System.out.println("max:" + max);
    }
}
