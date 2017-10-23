package com.example.harshavardhan.a2z.library;
import com.example.harshavardhan.a2z.entry.*;

public class Book {
private String name,author,publications,edition,serialKey,issuedTo;
private Date duedate;
public int totalBooks;
public void set(String a, String b, String c, String d, String e,String f,int x,int y,int z,int r)
{
	name=a;
	author=b;
	publications=c;
	edition=d;
	serialKey=e;
	issuedTo=f;
	duedate.set(x, y, z);
	totalBooks=r;
}
public String getName()
{
	return name;
}
public String getAuthor()
{
	return author;
}
public String getPublication()
{
	return publications;
}
public String getCode()
{
	return serialKey;
}
public Date getDate()
{
	return duedate;
}
public void print()
{
	System.out.println(" ");
	System.out.println("Book Name -> "+name);
	System.out.println("Author -> "+author);
	System.out.println("Edition -> "+edition);
	System.out.println("Book serial ID -> "+serialKey);
	System.out.println("Publicatons -> "+publications);
	if(issuedTo!=null)
	{
		System.out.println("Issued To -> "+issuedTo);
	}
}
}
