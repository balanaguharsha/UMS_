package com.example.harshavardhan.a2z.inputOutput;
import java.io.*;
public class Type implements Serializable {
	private String depts[];
	private int totalBooks,totalDepts,totalSections[],totalStudents;
	public void set(int x,int y,int z[],String p[],int a)
	{
		totalBooks=x;
		totalDepts=y;
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
		return totalDepts;
	}
	public int totalSections(int x)
	{
		return totalSections[x];
	}
	public int totalSections(String a)
	{
		int x=0;
		for(int i=0;i<totalDepts;i++)
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
