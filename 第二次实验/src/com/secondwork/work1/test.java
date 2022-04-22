package com.secondwork.work1;

public class test {
    public static void main(String[] args) {
        AppConfig app1 = AppConfig.getInstance();
        AppConfig app2 = AppConfig.getInstance();
        if(app1==app2){
            System.out.println("仅有一个实例对象");
        }
        else{
            System.out.println("有多个实例对象");
        }
    }
}
