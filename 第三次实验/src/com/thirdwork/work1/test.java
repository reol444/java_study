package com.thirdwork.work1;

public class test {
    public static void main(String[] args){
        MobileShop shop=new MobileShop();//定义手机专卖店
        shop.setMobilePhone_num(50);//100台手机
        System.out.println("手机专卖店目前有"+shop.getMobilePhone_num()+"部手机");
        shop.PurchaseMoney1.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobilePhone_num()+"部手机");
        shop.PurchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobilePhone_num()+"部手机");
        shop.PurchaseMoney3.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobilePhone_num()+"部手机");
    }
}
