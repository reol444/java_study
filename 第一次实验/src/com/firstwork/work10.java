package com.firstwork;
import java.util.function.Function;

public class work10 {
    public static void main(String[] args){
        Function<Double,Double> f=(x)->1-x*x;
        double I1=integral(0,1,f);
        System.out.println("结果为："+I1);
    }

    public static double integral(double a, double b, Function<Double,Double> f){
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
