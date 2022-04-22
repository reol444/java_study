package com.firstwork;

public class work7 {
    public static void main(String args[]){
        int a[] = {18,25,7,36,13,2,89,63};
        int max=Integer.MIN_VALUE;
        int max_num=-1;
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                max_num=i;
            }
        }
        System.out.print("最大数和其下标为："+max+","+max_num);
    }
}
