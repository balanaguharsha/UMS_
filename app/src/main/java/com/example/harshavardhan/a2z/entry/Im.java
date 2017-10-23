package com.example.harshavardhan.a2z.entry;

import java.io.Serializable;

/**
 * Created by SAKSHAM on 10/24/2017.
 */

public class Im implements Serializable {

    private String depts[];
    private int totalBooks,totalSections[],totalStudents;
    public Im()
    {

    }
    public Im(int x,int z[],String p[],int a)
    {
        totalBooks=x;
        totalSections=z;
        depts=p;
        totalStudents=a;
    }
    public int books()
    {
        return totalBooks;
    }
    public int totalDepts()
    {
        return depts.length;
    }
    public int totalSections(int x)
    {
        return totalSections[x];
    }
    public int totalSections(String a)
    {
        int x=0;
        for(int i=0;i<depts.length;i++)
        {
            if(depts[i].contentEquals(a))
            {
                x=i;
                break;
            }
        }
        return totalSections[x];
    }
    public int totalStudents()
    {
        return totalStudents;
    }
}
