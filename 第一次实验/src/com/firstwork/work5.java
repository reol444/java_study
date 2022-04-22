package com.firstwork;
public class work5 {
    public static void main(String args[]){
        work5 mywork=new work5();
        mywork.Narcissus();
        System.out.println();
        mywork.MultiplicationTabel();
        System.out.println();
        mywork.GCD(9,12);
        System.out.println();
        mywork.Chicken();
        System.out.println();
        if(mywork.isPrime(29)){
            System.out.println("29是质数");
        }
        else{
            System.out.println("29不是质数");
        }
    }
    //水仙花数
    public void Narcissus() {
        for (int i=100;i<1000;i++){
            int a=i%10;
            int b=(i/10)%10;
            int c=i/100;
            if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i){
                System.out.println(i);
            }
        }
    }

    //乘法表输出
    public void MultiplicationTabel(){
        for (int row=1;row<=9;row++){
            for (int col=1;col<=row;col++){
                System.out.print(row*col);
                System.out.print(' ');

            }
            System.out.println();
        }
    }

    //求最大公约数
    public void GCD(int a,int b) {
        if (a<0||b<0)return;
        if (b==0) {
            System.out.println("最大公约数为"+a);
        }
        else{
            GCD(b,a%b);
        }

    }

    //百元百鸡问题
    public void Chicken(){
        for (int i=0;i<33;i++){
            for (int j=0;j<(100-3*i)/4;j++){
                int k=100-i-j;
                if(3*i+4*j+0.5*k==100){
                    System.out.println("母鸡买"+i+"只， 公鸡买"+j+"只, 小鸡买"+k+'只');
                }

            }
        }
    }

    //质数判断
    public boolean isPrime(int n){
        boolean b=true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                b = false;
                break;
            }
        }
        return b;
    }
}
