package com.example.harshavardhan.a2z.inputOutput;
import android.content.Context;

import com.example.harshavardhan.a2z.library.Book;
import com.example.harshavardhan.a2z.entry.Im;
import java.io.*;
public class UpdateBooks {
public Book[] f(Context con) throws IOException,ClassNotFoundException
{
	ObjectInputStream x = new ObjectInputStream(con.openFileInput("StIm"));
	Im r = (Im)x.readObject();
	ObjectInputStream fp = new ObjectInputStream(con.openFileInput("StBooks"));
	
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
