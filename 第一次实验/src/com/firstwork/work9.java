package com.firstwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class work9 {
    public static void main(String[] args){
        work9 mywork=new work9();
        Function<Double,Double> f1=(x)->x*x;
        Function<Double,Double> f2=(x)->2-x*x;
        Map<String,Double> map=mywork.solve(2,0,-2);
        double x1=map.get("x1");
        double x2=map.get("x2");
        System.out.println("交点的横坐标为："+x1+" "+x2);
        double I1=mywork.integral(x1,x2,f1);
        double I2=mywork.integral(x1,x2,f2);
        double result=Math.abs(I1-I2);
        System.out.println("结果为："+result);
    }
    public Map<String,Double> solve(double a,double b,double c){
        Map<String,Double> map = new HashMap<String,Double>();
        double delta=b*b-4*a*c;
        double x1=(-b+Math.sqrt(delta))/(2*a);
        double x2=(-b-Math.sqrt(delta))/(2*a);
        map.put("x1",x1);
        map.put("x2",x2);
        return map;
    }
    public double integral(double a, double b, Function<Double,Double> f){
        double sum = 0;
        int n=10000;
        double delta = (b - a) / n;
        for (int j = 1; j <= n; j++) {
            double x = a + j * delta;
            sum = sum + f.apply(x)*delta;
        }
        return sum;
    }
}
