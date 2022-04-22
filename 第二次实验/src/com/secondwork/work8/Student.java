package com.secondwork.work8;

public class Student {
    private String name;
    private int number;
    private double score;

    Student(){}

    Student(String name,int number,double score) {
        this.name=name;
        this.number=number;
        this.score=score;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    int getNumber(){
        return number;
    }
    void setNumber(int number){
        this.number=number;
    }

    double getScore(){
        return score;
    }
    void setScore(double score){
        this.score=score;
    }
}
