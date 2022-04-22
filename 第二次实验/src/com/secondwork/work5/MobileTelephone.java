package com.secondwork.work5;

public class MobileTelephone {
    SIM sim;
    void setSIM(SIM s){
        sim=s;
    }
    String showNumber(){
        return sim.getNumber();
    }
}
