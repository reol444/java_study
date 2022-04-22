package com.test.test1;
public class test1 {
//    public static void main(String args[]){
//        son myson=new son();
//        father myfather=myson;
//        jiekou j=myson;
//        j.work();
//        jiekouson js=myson;
//        js.work1();
//        js.work();
//        jiekou j1=()->{
//            System.out.println("1");
//        };
//        j1.work();
//        System.out.println(myfather.name);
//        System.out.println(myfather.age);
//        myfather.dosomething();
//        System.out.println(myfather.name);
//        System.out.println(5.10-5.00);
//
//    }
    static class ExA{
        static {
            System.out.println("父静态块");
        }
        {
            System.out.println("父非静态块");
        }
        public ExA(){
            System.out.println("父构造函数");
        }
    }
    static class ExB extends ExA{
        static {
            System.out.println("子静态块");
        }
        {
            System.out.println("子非静态块");
        }
        public ExB(){
            System.out.println("子构造函数");
        }
    }
    public static void main(String args[]){
        new ExB();
    }
}
