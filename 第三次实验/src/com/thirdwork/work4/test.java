package com.thirdwork.work4;

public class test {
    public static void main(String[] args){
        normaldoor mydoor1=new normaldoor();
        mydoor1.open();
        mydoor1.close();
        System.out.println();
        alarmdoor mydoor2=new alarmdoor();
        mydoor2.open();
        mydoor2.close();
    }
}
