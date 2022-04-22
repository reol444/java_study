package com.test.test1;

public class son extends father implements jiekouson{
    int age=10;
    son(){
//        super.age=10;
        name="son";
    }

    @Override
    public void work() {
        System.out.println("父接口work");
    }

    @Override
    public void work1() {
        System.out.println("子接口work");
    }

    public void dosomething(){
        System.out.println("son do something");
    }
}
