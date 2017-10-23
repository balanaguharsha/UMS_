package com.example.harshavardhan.a2z.entry;

public class Date 
{
	private int day,month,year;
	public void set(int x,int y,int z)
	{
		day=x;
		month=y;
		year=z;
	}
	public void print()
	{
		System.out.print(day+"/"+month+"/"+year);
	}
}
