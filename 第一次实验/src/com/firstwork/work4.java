package com.firstwork;
import java.util.*;
public class work4 {
    public static void main(String[] args) {
        System.out.print("请输入层数：");
        Scanner s = new Scanner(System.in);
        int totalLevel = s.nextInt();
        for (int i = 0; i < totalLevel; i++) {
            for (int j = 0; j < totalLevel - i - 1; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
                System.out.println();
                continue;
            }
            if (i == totalLevel - 1) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                break;
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
