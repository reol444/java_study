package com.thirdwork.work2;

public class test {
    public static void main(String[] args) {
        testIDcard mytest=new testIDcard();
        mytest.check("130681198712092019");
        mytest.check("13068119871209201x");
        mytest.check("13068119871209201");
        mytest.check("123456789012345");
        mytest.check("12345678901234x");
        mytest.check("1234567890123");
        mytest.check("520201200103065612");
    }
}
