package com.secondwork.work6;

public class kid {
    static int count=0;
    String name;
    kid(String n){
        this.name=n;
    }
    void add(){
        count++;
        System.out.println("当前加入孩子的名字为"+name+"，当前人数为："+count);
    }
}
