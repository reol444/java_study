package com.secondwork.work7;

public class People {
    public String name;
    protected String sex;
    private int ID;
    int age;
    public People(){}
    //类内，均可以访问
    public People(String name, int ID, String sex,int age) {
        this.name=name;
        this.ID=ID;
        this.sex=sex;
        this.age=age;
    }
}
