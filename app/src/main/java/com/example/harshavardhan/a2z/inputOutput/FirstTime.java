package com.example.harshavardhan.a2z.inputOutput;

/**
 * Created by SAKSHAM on 10/23/2017.
 */
import android.content.Context;

import com.example.harshavardhan.a2z.entry.*;
import com.example.harshavardhan.a2z.library.Book;

import java.io.*;

public class FirstTime implements Serializable{
    public void f(Context con) throws FileNotFoundException,IOException {
        String boks[] = {"12","23","24"};
        String boks2[] = {"12","23","34"};
        Student s1 = new Student("harsha","cb.en.u4cse16207","1234harsha",boks,500,1);
        Student s2 = new Student("saksham","cb.en.u4cse16243","1234saksham",boks2,550,2);

        String name = "cse162";
        String subjects[] = {"15ECE202","15CSE201","15CSE202","15CSE281","15CSE202"};
        String attendence[][]={{"11"},{"10"},{"00"},{"01"},{"11"}};
        String announcements[]={"Hello There!!!","You look so good"};
        String worksGiven[][]={{null},{"WorkToDo.txt"},{"null"},{"workNow.txt"},{null}};
        Helping help = new Helping(name,subjects,attendence,announcements,worksGiven,2,2);

        Book b1 = new Book();
        b1.set("H1","Me","Amrita","7th","11","Saksham",23,10,2017,16);
        Book b2 = new Book();
        b2.set("H1","Me","Amrita","7th","12","Saksham",23,10,2017,16);
        Book b3 = new Book();
        b3.set("H1","Me","Amrita","7th","13","Saksham",23,10,2017,16);
        Book b4 = new Book();
        b4.set("H1","Me","Amrita","7th","14","Saksham",23,10,2017,16);
        Book b5 = new Book();
        b5.set("H1","Me","Amrita","7th","21","Saksham",23,10,2017,16);
        Book b6 = new Book();
        b6.set("H1","Me","Amrita","7th","22","Saksham",23,10,2017,16);
        Book b7 = new Book();
        b7.set("H1","Me","Amrita","7th","23","Saksham",23,10,2017,16);
        Book b8 = new Book();
        b8.set("H1","Me","Amrita","7th","24","Saksham",23,10,2017,16);
        Book b9 = new Book();
        b9.set("H1","Me","Amrita","7th","31","Harsha",23,10,2017,16);
        Book b10 = new Book();
        b10.set("H1","Me","Amrita","7th","32","Harsha",23,10,2017,16);
        Book b11 = new Book();
        b11.set("H1","Me","Amrita","7th","33","Harsha",23,10,2017,16);
        Book b12 = new Book();
        b12.set("H1","Me","Amrita","7th","34","Harsha",23,10,2017,16);
        Book b13 = new Book();
        b13.set("H1","Me","Amrita","7th","41","Harsha",23,10,2017,16);
        Book b14 = new Book();
        b14.set("H1","Me","Amrita","7th","42","Harsha",23,10,2017,16);
        Book b15 = new Book();
        b15.set("H1","Me","Amrita","7th","43","Harsha",23,10,2017,16);
        Book b16 = new Book();
        b16.set("H1","Me","Amrita","7th","44","Harsha",23,10,2017,16);


        int p[]={4,2};
        String calss[]={"CSE","ECE"};
        Im im = new Im(16,p,calss,2);
        ObjectOutputStream fp = null;
        fp=new ObjectOutputStream(con.openFileOutput("StIm",Context.MODE_PRIVATE));
        fp.writeObject(im);
        fp=new ObjectOutputStream(con.openFileOutput("StFile",Context.MODE_PRIVATE));
        fp.writeObject(s1);
        fp.writeObject(s2);
        fp = new ObjectOutputStream(con.openFileOutput("StHelp",Context.MODE_PRIVATE));
        fp.writeObject(help);
        fp=new ObjectOutputStream(con.openFileOutput("StBooks",Context.MODE_PRIVATE));
        fp.writeObject(b1);
        fp.writeObject(b2);
        fp.writeObject(b3);
        fp.writeObject(b4);
        fp.writeObject(b5);
        fp.writeObject(b6);
        fp.writeObject(b7);
        fp.writeObject(b8);
        fp.writeObject(b9);
        fp.writeObject(b10);
        fp.writeObject(b11);
        fp.writeObject(b12);
        fp.writeObject(b13);
        fp.writeObject(b14);
        fp.writeObject(b15);
        fp.writeObject(b16);
        fp.close();
    }
}
