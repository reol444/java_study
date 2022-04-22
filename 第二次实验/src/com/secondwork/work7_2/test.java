package com.secondwork.work7_2;

import com.secondwork.work7.People;
//包外
public class test {
    public static void main(String[] args){
        People p=new People("Jonh",123,"man",25);
        String name=p.name; //public，可以在全局访问
        //int ID=p.ID; //报错，为private，仅能在同一类中访问
        //String sex= p.sex; //报错，protected，能在同一类、同一包以及子类中访问
        //int age=p.age; //报错，default，能在同一类、同一包中访问，不能在不同包中的子类中访问
    }
}
