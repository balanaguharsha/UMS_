package com.example.harshavardhan.a2z.inputOutput;

import com.example.harshavardhan.a2z.entry.Helping;
import com.example.harshavardhan.a2z.entry.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by SAKSHAM on 10/24/2017.
 */

public class UpdateHelping {
    public Helping f(Student s) throws IOException,ClassNotFoundException
    {
        Helping cl = new Helping();
        String a = s.getStudentID().substring(8, 10);
        ObjectInputStream fp = new ObjectInputStream(new FileInputStream(a));
        UpdateType u =new UpdateType();
        Type t=u.f();
        for(int i=0;i<t.totalSections(a);i++)
        {
            cl=(Helping) fp.readObject();
            if(cl.getName().contentEquals(s.getStudentID().substring(11, 13).toLowerCase()))
            {
                break;
            }
        }
        fp.close();
        return cl;
    }
}
