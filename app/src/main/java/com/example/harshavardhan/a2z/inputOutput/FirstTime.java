package com.example.harshavardhan.a2z.inputOutput;

/**
 * Created by SAKSHAM on 10/23/2017.
 */
import com.example.harshavardhan.a2z.entry.*;

import java.io.*;

public class FirstTime implements Serializable{
    void f() throws FileNotFoundException,IOException {
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

        int p[]={4,2};
        String calss[]={"CSE","ECE"};
        Im t = new Im(16,p,calss,2);
        ObjectOutputStream fp = null;
        fp=new ObjectOutputStream(new FileOutputStream("StFile"));
        fp.writeObject(s1);
        fp.writeObject(s2);
        fp = new ObjectOutputStream(new FileOutputStream("StHelp"));
        fp.writeObject(help);
        fp=new ObjectOutputStream(new FileOutputStream("StIm"));
        fp.writeObject(t);
        fp.close();
    }
}
