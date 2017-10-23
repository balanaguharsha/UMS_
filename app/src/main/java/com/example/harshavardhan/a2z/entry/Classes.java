package com.example.harshavardhan.a2z.entry;
import java.io.*;

public class Classes implements Serializable 
{
	public String number,subjects[],attend[][],assignments[][],announcements[];
	public int totalStudents,totalElectives;
	public Classes()
	{
		
	}
	public void set(String n,String announ[],int elect,String a[],String b[][],int announce,String d[][],int t)
	{
		number=n;
		subjects=a;
		attend=b;
		announcements=announ;
		assignments=d;
		totalStudents=t;
		totalElectives=elect;
	}
}
