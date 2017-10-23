package com.example.harshavardhan.a2z.inputOutput;
import com.example.harshavardhan.a2z.entry.Student;
import java.io.*;
/**
 * Created by HARSHA VARDHAN on 22-10-2017.
 */

public class UpdateStudent {

    public Student[] f() throws IOException,ClassNotFoundException
    {
        ObjectInputStream x = new ObjectInputStream(new FileInputStream("Hi"));
        ObjectInputStream fp = new ObjectInputStream(new FileInputStream("Student"));

        Type r = (Type)x.readObject();
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
