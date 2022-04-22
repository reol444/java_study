package com.firstwork;

public class work3 {
    public static void main(String[] args) {
        int[][] a=new int[10][10];
        int x=0,y=0,max=Integer.MIN_VALUE;
        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                a[i][j]=(int) (Math.random()*100);
            }
        }
        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                if (a[i][j]>max) {
                    max=a[i][j];
                    x=i+1;
                    y=j+1;
                }
            }
        }
        System.out.println("最大值是："+max);
        System.out.println("坐标是：("+x+","+y+")");
    }
}
