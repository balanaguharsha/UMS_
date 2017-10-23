package com.example.harshavardhan.a2z.monetary;
import java.io.*;

import com.example.harshavardhan.a2z.entry.Student;
import com.example.harshavardhan.a2z.inputOutput.Type;

public class Transaction {
public void add(double x,Student s) throws IOException,ClassNotFoundException
{
	s.setMoney(x);
	//writeStudent(s);
}
public boolean withdraw(double x,Student s) throws IOException,ClassNotFoundException
{
	if(x>s.getMoney())
		return false;
	s.setMoney(-x);
	//writeStudent(s);
	return true;
}
public boolean check(double x,Student s)
{
	if(x>s.getMoney())
		return false;
	return true;
}
public void checkBalance(Student s)
{
	System.out.println("Your balance is : Rs."+s.getMoney());
}

private void writeStudent(Student st) throws IOException,ClassNotFoundException
{
	ObjectInputStream x = new ObjectInputStream(new FileInputStream("Hi"));
	ObjectInputStream fp = new ObjectInputStream(new FileInputStream("Student"));
	ObjectOutputStream wp = new ObjectOutputStream(new FileOutputStream("Student"));
	
	Type t = new Type();
	t=(Type)x.readObject();
	int max = t.totalStudents();
	Student s[] = new Student[max];
	for(int i=0;i<max;i++)
	{
		s[i]=(Student)fp.readObject();
		if(s[i].getName().contentEquals(st.getName()))
		{
			s[i]=st;
		}
	}
	for(int i=0;i<max;i++)
	{
		wp.writeObject(s[i]);
	}
	
	x.close();
	fp.close();
	wp.flush();
	wp.close();
}

}
