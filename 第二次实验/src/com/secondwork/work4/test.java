package com.secondwork.work4;
public class test {
    public static void main(String args[]){
        Battery nanfu =new Battery(100);
        System.out.println("南孚电池的储电量为:"+nanfu.power);
        Radio radio=new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu);
        System.out.println("使用完收音机后南孚电池的电量为:"+nanfu.power);
    }
}

