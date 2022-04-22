package com.firstwork;
import java.util.Scanner;
public class work6 {
    public static void main(String[] args){
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)){
                System.out.print("此数不是回文数");
                return;
            }
        }
        System.out.print("此数是回文数");
    }
}
