package com.secondwork.work8;

public class test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("Daisy");
        stu.setNumber(20);
        stu.setScore(98);
        System.out.println("学生姓名为"+stu.getName()+"，年龄为"+stu.getNumber()+"，成绩为"+stu.getScore());
        stu.setName("John");
        stu.setNumber(22);
        stu.setScore(95);
        System.out.println("学生姓名为"+stu.getName()+"，年龄为"+stu.getNumber()+"，成绩为"+stu.getScore());
    }
}
