package com.thirdwork.work6;

import java.util.ArrayList;
import java.util.List;

public class mall {
    List<goods> goodslist=new ArrayList<goods>();
    mall(){}
    public goods getgoods(int id){
        for(int i=0;i<goodslist.size();i++){
            goods g=goodslist.get(i);
            if(g.id==id){
                return g;
            }
        }
        return null;
    }
    public void addgoods(goods g){
        goodslist.add(g);
    }
    public void salegoods(int id,int num){
        goods g=getgoods(id);
        if (num > g.inventory) {
            g.salenum+=g.inventory;
            g.inventory=0;
        }
        else {
            g.inventory-=num;
            g.salenum+=num;
        }
    }
    public void returngoods(int id,int num){
        goods g=getgoods(id);
        if (num > g.salenum) {
            g.inventory+=g.salenum;
            g.salenum=0;
        }
        else {
            g.inventory+=num;
            g.salenum-=num;
        }
    }
    public void resetgoods(int id){
        goods g=getgoods(id);
        g.inventory+=g.salenum;
        g.salenum=0;
    }
    public void showgoods() {
        int k = 0;

        for(int i=0;i<goodslist.size();i++){
            goods g=goodslist.get(i);
            if(g.salenum!=0){
                k++;
            }
        }
        System.out.println(k);//输出购买种类的数量
        double sum = 0;
        for(int i=0;i<goodslist.size();i++) {
            goods g=goodslist.get(i);
            if(g.salenum!=0) {
                System.out.println(g.id + " " + g.name + " "+ g.producers + " "+g.price+" "+g.inventory+" "+g.salenum);
                sum = sum + g.price * g.salenum;//计算总价
            }
        }
        System.out.println(sum);//输出总价
    }
}
