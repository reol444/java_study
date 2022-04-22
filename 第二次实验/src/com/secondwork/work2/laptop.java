package com.secondwork.work2;

public class laptop {
    private String brand;
    private int state;

    public laptop(){
        System.out.println("无参构造");
    }

    public laptop(String brand, int state){//带参构造函数
        this.brand=brand;
        this.state=state;
        System.out.println("有参构造");
    }
}
