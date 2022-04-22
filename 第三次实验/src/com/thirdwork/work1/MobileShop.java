package com.thirdwork.work1;

public class MobileShop {
    int MobilePhone_num; //手机数量
    InnerPurchaseMoney PurchaseMoney1; //购物卷1
    InnerPurchaseMoney PurchaseMoney2; //购物卷2
    InnerPurchaseMoney PurchaseMoney3; //购物卷3
    class InnerPurchaseMoney{
        int Value;
        InnerPurchaseMoney(int value){
            Value=value;
        }
        void buyMobile(){
            MobilePhone_num--;
            System.out.println("已使用面值为"+Value+"的购物券购买了一部手机");
        }
    }
    MobileShop(){
        PurchaseMoney1=new InnerPurchaseMoney(1000);
        PurchaseMoney2=new InnerPurchaseMoney(500);
        PurchaseMoney3=new InnerPurchaseMoney(200);
    }

    void setMobilePhone_num(int num){
        MobilePhone_num=num;
    }
    int getMobilePhone_num(){
        return MobilePhone_num;
    }
}

