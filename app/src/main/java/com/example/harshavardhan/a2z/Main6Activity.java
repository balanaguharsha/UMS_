package com.example.harshavardhan.a2z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.harshavardhan.a2z.entry.Student;
import com.example.harshavardhan.a2z.library.Book;
import java.io.*;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Student s=new Student();
        try {
            ObjectInputStream fp = new ObjectInputStream(getApplicationContext().openFileInput("StName"));
            s = (Student) fp.readObject();
            fp.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String bname[]=s.getBookID();
//        for(int i=0;i<bname.length;i++)
//        {
//            Book bo=getBook(b,bname[i]);
//            System.out.println("Book "+(i+1)+" : "+bo.getName());
//            System.out.print("Due date : ");
//            bo.getDate().print();
//            System.out.println("\n\n");
//        }

    }
}
