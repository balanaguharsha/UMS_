package com.example.harshavardhan.a2z.entry;

import android.os.Parcelable;

import java.io.*;

public class Student implements Serializable
{
    private String name,studentID,password,bookID[];
    private double money;
    private int elective;
    public Student()
    {

    }
    public Student(String x,int elect,String y,String joker,String req[],double e)
    {
        name=x;
        studentID=y;
        password=joker;
        bookID=req;
        money=e;
        elective=elect;
    }
    public String getName()
    {
        return name;
    }
    public String getStudentID()
    {
        return studentID;
    }
    public String getPass()
    {
        return password;
    }
    public String[] getBookID()
    {
        return bookID;
    }
    public double getMoney()
    {
        return money;
    }
    public int getelect()
    {
        return elective;
    }
    public void setMoney(double x)
    {
        money+=x;
    }
}