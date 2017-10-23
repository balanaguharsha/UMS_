package com.example.harshavardhan.a2z.inputOutput;
import com.example.harshavardhan.a2z.library.Book;
import java.io.*;
public class UpdateBooks {
public Book[] f() throws IOException,ClassNotFoundException
{
	ObjectInputStream x = new ObjectInputStream(new FileInputStream("Hi"));
	Type r = (Type)x.readObject();
	ObjectInputStream fp = new ObjectInputStream(new FileInputStream("Book"));
	
	Book[] books=new Book[r.books()];
	for(int i=0;i<r.books();i++)
	{
		books[i]=(Book)fp.readObject();
	}
	x.close();
	fp.close();
	return books;
}
}
