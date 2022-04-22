package com.firstwork;

public class work2 {
    public static void main(String[] args) {
        int a[] = {2,6,3,8,4,9,7};
        work2 mywork=new work2();
        mywork.reverse(a);
    }
    public int reverse(int[] a){
        int l=a.length;
        for(int i = 0;i < l/2;i++) {
            int temp = a[i];
            a[i] = a[l - 1 - i];
            a[l - 1 - i] = temp;
        }
        System.out.print("整型数组逆序输出为：");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");
        return 0;
    }
}

