package com.example.harshavardhan.a2z.inputOutput;

import java.io.*;

public class UpdateType {
public Type f() throws IOException,ClassNotFoundException
{
	Type t=new Type();
	
	ObjectInputStream fp = new ObjectInputStream(new FileInputStream("Hi"));
	
	t=(Type)fp.readObject();
	
	fp.close();
	
	return t;
}
}
