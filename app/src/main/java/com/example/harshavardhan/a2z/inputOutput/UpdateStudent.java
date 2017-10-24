package com.example.harshavardhan.a2z.inputOutput;
import android.content.Context;

import com.example.harshavardhan.a2z.entry.Im;
import com.example.harshavardhan.a2z.entry.Student;
import java.io.*;
/**
 * Created by HARSHA VARDHAN on 22-10-2017.
 */

public class UpdateStudent {

    public Student[] f(Context con) throws IOException,ClassNotFoundException
    {
        ObjectInputStream x = new ObjectInputStream(con.openFileInput("StIm"));
        ObjectInputStream fp = new ObjectInputStream(con.openFileInput("StFile"));

        Im r = (Im)x.readObject();
        Student s[] = new Student[r.totalStudents()];
        for(int i=0;i<r.totalStudents();i++)
        {
            s[i]=(Student)fp.readObject();
        }
        x.close();
        fp.close();
        return s;
    }

}
