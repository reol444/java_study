package com.thirdwork.work6;

public class goods {
    int id;
    String name;
    String producers;
    double price;
    int inventory;
    int salenum;

    goods(){}

    goods(int id, String name, String producers, double price, int inventory, int salenum){
        this.id=id;
        this.name=name;
        this.producers=producers;
        this.price=price;
        this.inventory=inventory;
        this.salenum=salenum;
    }
}
