package com.example.harshavardhan.a2z.entry;

import java.io.Serializable;

/**
 * Created by SAKSHAM on 10/24/2017.
 */

public class Helping implements Serializable{
    private String name,subjects[],attend[][],assignments[][],announcements[];
    private int totalStudents,totalElectives;
    public Helping()
    {

    }
    public Helping(String n,String a[],String b[][],String announ[],String d[][],int t,int elect)
    {
        name=n;
        subjects=a;
        attend=b;
        announcements=announ;
        assignments=d;
        totalStudents=t;
        totalElectives=elect;
    }
    public String getName()
    {
        return name;
    }
}
