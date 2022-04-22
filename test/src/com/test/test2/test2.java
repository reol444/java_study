package com.test.test2;

public class test2 {
    public static void main(String[] args) {
        B b=new B();
        b.g();
        b.f();
        b.g();
    }
}
class A{
    int x=20;
    int y=10;
    void f(){
        y=y+x;
        System.out.println(x+" "+y);
    }
    void g(){
        y=y+1;
        System.out.println(y);
    }
}
class B extends A{
    void f(){
        y=y+2;
        System.out.println(x+" "+y);
    }
}
