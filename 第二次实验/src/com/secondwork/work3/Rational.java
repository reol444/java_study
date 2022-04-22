package com.secondwork.work3;

class Rational{
    // 分子
    int numerator=1;
    // 分母
    int denominator=1;
    // 设置分子
    void setNumerator(int a){
        int c=gcd(Math.abs(a), denominator);
        // 除以最大公约数
        numerator=a/c;
        denominator=denominator/c;
        if (numerator<0&&denominator<0){
            numerator=-numerator;
            denominator=-denominator;
        }
    }
    // 设置分母
    void setDenominator(int b){
        int c=gcd(Math.abs(numerator), b);
        // 除以最大公约数
        numerator=numerator/c;
        denominator=b/c;
        if (numerator<0&&denominator<0){
            numerator=-numerator;
            denominator=-denominator;
        }
    }
    // 获取分子
    int getNumerator(){
        return numerator;
    }
    // 获取分母
    int getDenominator(){
        return denominator;
    }
    // 计算最大公约数
    int gcd(int a,int b){
        if(a==0){
            return 1;
        }
        if(a<b){
            int c=a;
            a=b;
            b=c;
        }
        int r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    // 加法运算
    Rational add(Rational r){
        // 获取有理数r的分子
        int a=r.getNumerator();
        // 获取有理数r的分母
        int b=r.getDenominator();
        // 计算新的分子
        int c=numerator*b+denominator*a;
        // 计算新的分母
        int d=denominator*b;
        // 返回新的有理数
        Rational result=new Rational();
        result.setNumerator(c);
        result.setDenominator(d);
        return result;
    }
    // 减法运算
    Rational sub(Rational r){
        // 获取有理数r的分子
        int a=r.getNumerator();
        // 获取有理数r的分母
        int b=r.getDenominator();
        // 计算新的分子
        int c=numerator*b-denominator*a;
        // 计算新的分母
        int d=denominator*b;
        // 返回新的有理数
        Rational result=new Rational();
        result.setNumerator(c);
        result.setDenominator(d);
        return result;
    }
    // 乘法运算
    Rational muli(Rational r){
        // 获取有理数r的分子
        int a=r.getNumerator();
        // 获取有理数r的分母
        int b=r.getDenominator();
        // 计算新的分子
        int c=numerator*a;
        // 计算新的分母
        int d=denominator*b;
        // 返回新的有理数
        Rational result=new Rational();
        result.setNumerator(c);
        result.setDenominator(d);
        return result;
    }
    // 除法运算
    Rational div(Rational r){
        // 获取有理数r的分子
        int a=r.getNumerator();
        // 获取有理数r的分母
        int b=r.getDenominator();
        // 计算新的分子
        int c=numerator*b;
        // 计算新的分母
        int d=denominator*a;
        // 返回新的有理数
        Rational result=new Rational();
        result.setNumerator(c);
        result.setDenominator(d);
        return result;
    }
}