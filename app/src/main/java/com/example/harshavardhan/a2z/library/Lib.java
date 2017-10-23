package com.example.harshavardhan.a2z.library;
import android.widget.Toast;

import com.example.harshavardhan.a2z.entry.*;


public class Lib
{	
	public int[] SearchBookName(String name,Book b[])
	{	
		int find[] = new int[100];
		int i=0;
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j].getName().contentEquals(name))
			{
				find[i]=j;
				i++;
			}
		}
		return find;
	}
	
	
	public int[] SearchBookAuthor(String name,Book b[])
	{
		int find[] = new int[b.length];
		int i=0;
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j].getAuthor().contentEquals(name))
			{
				find[i]=j;
				i++;
			}
		}
		return find;
	}
	
	
	public int[] SearchBookWordsInTitle(String name,Book b[])
	{		
		int find[] = new int[b.length];
		int i=0;
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j].getName().contains(name))
			{
				find[i]=j;
				i++;
			}
		}
		return find;
	}
	
	public int[] SearchPublication(String name,Book b[])
	{
		int find[] = new int[b.length];
		int i=0;
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j].getPublication().contains(name))
			{
				find[i]=j;
				i++;
			}
		}
		return find;
	}
	
	public boolean BooksInHand(Student s,Book b[])
	{
		String bname[]=s.getBookID();
		if(bname.length==0)
			return true;
		return false;
	}
	private Book getBook(Book b[],String x)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getCode().contentEquals(x))
			{
				return b[i];
			}
		}
		return null;
	}
	
}
