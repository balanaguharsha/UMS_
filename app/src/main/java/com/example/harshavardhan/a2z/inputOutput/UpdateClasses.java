package com.example.harshavardhan.a2z.inputOutput;
import java.io.*;

import com.example.harshavardhan.a2z.entry.*;
import com.example.harshavardhan.a2z.inputOutput.UpdateType;


public class UpdateClasses 
{
	public Classes f(Student s) throws IOException,ClassNotFoundException
	{
		Classes cl = new Classes();
		String a = s.getStudentID().substring(8, 10);
		ObjectInputStream fp = new ObjectInputStream(new FileInputStream(a));
		UpdateType u =new UpdateType();
		Type t=u.f();
		for(int i=0;i<t.totalSections(a);i++)
		{
			cl=(Classes)fp.readObject();
			if(cl.number.contentEquals(s.getStudentID().substring(11, 13)))
			{
				break;
			}
		}
		fp.close();
		return cl;
	}
}
