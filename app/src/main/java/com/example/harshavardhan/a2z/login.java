package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harshavardhan.a2z.inputOutput.UpdateStudent;
import com.example.harshavardhan.a2z.entry.Student;

import java.io.*;

public class login extends AppCompatActivity {
    Button b;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        b=(Button)findViewById(R.id.log);
        e1=(EditText)findViewById(R.id.user);
        e2=(EditText)findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student s=new Student("Saksham",1,"16243","1234",null,500);
                //                UpdateStudent x=new UpdateStudent();
//                try {
//                    s=x.f();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
                boolean check=false;
                if(s.getStudentID().contentEquals(e1.getText().toString().toLowerCase())&&s.getPass().contentEquals(e2.getText().toString()))
                    check=true;
//                int i;
//                for(i=0;i<s.length;i++)
//                {
//                    if(s[i].getStudentID().contentEquals(e1.getText().toString()))
//                    {
//                        check=true;
//                        break;
//                    }
//
//                }
                if(!check){
                    Toast.makeText(getApplicationContext(),R.string.errmsg,Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent in = new Intent(getApplicationContext(), MainActivity.class);
                    try{
                    ObjectOutputStream fp= new ObjectOutputStream(new FileOutputStream("StName"));
                    fp.writeObject(s);
                    fp.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    startActivity(in);
                }
            }
        });

    }
}
