package com.company;

public class XayDungLop {
    private int rollno;
    private String name ;
    private static String college ="adsfd";
    XayDungLop(int  r ,  String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "codegym";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
