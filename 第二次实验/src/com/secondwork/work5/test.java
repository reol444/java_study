package com.secondwork.work5;

public class test {
    public static void main(String args[]){
        MobileTelephone mobile =new MobileTelephone();
        SIM SIM1=new SIM("13986422610");
        mobile.setSIM(SIM1);
        System.out.println("初始手机号码为:"+mobile.showNumber());
        SIM SIM2=new SIM("13618669208");
        mobile.setSIM(SIM2);
        System.out.println("更换后的手机号码为:"+mobile.showNumber());
    }
}

