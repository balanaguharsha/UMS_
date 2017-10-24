package com.example.harshavardhan.a2z.entry;

import java.io.Serializable;

public class Date implements Serializable
{
	private int day,month,year;
	public void set(int x,int y,int z)
	{
		day=x;
		month=y;
		year=z;
	}
}
