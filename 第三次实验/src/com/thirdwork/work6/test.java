package com.thirdwork.work6;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        mall mymall=new mall();
        int n = in.nextInt();//输入商品基本信息
        for (int i = 0; i < n; i++) {
            int id = in.nextInt(); // 商品编号
            String name = in.next();// 商品名称
            String producers = in.next();// 生产商
            double price = in.nextDouble();// 商品价格
            int inventory = in.nextInt();// 库存
            goods g=new goods(id,name,producers,price,inventory,0);
            mymall.addgoods(g);
        }
        int m = in.nextInt();//输入购买信息
        for (int i = 0; i < m; i++) {
            int id = in.nextInt();
            int num = in.nextInt();
            int flag = in.nextInt();
            if (flag == 1) {//购买，更新货物信息
                mymall.salegoods(id,num);
            }
            else if (flag == 2) {//退货，更新货物信息
                mymall.returngoods(id,num);
            }
            else {//删除商品，更新货物信息
                mymall.resetgoods(id);
            }
        }
        mymall.showgoods();
    }
}
