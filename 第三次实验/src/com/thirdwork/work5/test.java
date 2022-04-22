package com.thirdwork.work5;

public class test {
    public static void main(String[] args) {
        try {
            int a = 39;
            int b = 0;
            int c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("异常信息为："+e.getMessage());
            System.out.println("除数不能为0。");
        }
        finally {
            System.out.println("方法完成。");
        }
    }
}
