package com.firstwork;

import java.util.Arrays;

public class work8 {
    public static void main(String[] args) {
        int[] a = {53, 8, 5, 65, 34, 27};
        System.out.println("排序前：" + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                int temp = 0;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(a));
    }
}
