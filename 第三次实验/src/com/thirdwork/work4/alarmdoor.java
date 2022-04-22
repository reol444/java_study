package com.thirdwork.work4;

public class alarmdoor extends door implements alarm {
    public void open() {
        System.out.println("打开这扇门，它将发出警铃");
        showalarm();
    }
    public void close() {
        System.out.println("关闭这扇门");
    }
    public void showalarm() {
        System.out.println("发出警铃");
    }
}
