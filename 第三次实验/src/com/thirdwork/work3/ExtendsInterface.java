package com.thirdwork.work3;

public class ExtendsInterface {
    public static void main(String arg[]){
        //普通用户
        ordinary o=new ordinaryuser();
        o.dining();
        //vip用户
        vip v=new vipuser();
        v.vipdining();
        //试用用户
        trial t=new trialuser();
        t.dining();
        t.vipdining();
    }
}
