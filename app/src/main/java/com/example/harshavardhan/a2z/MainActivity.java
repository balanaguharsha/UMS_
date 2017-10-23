package com.example.harshavardhan.a2z;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.harshavardhan.a2z.entry.Student;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


import java.nio.file.Files;
import java.io.*;


public class MainActivity extends Activity {
    Button b1,b2,b3,b4,b;
    TextView t;
    Student s=new Student();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            ObjectInputStream fp = new ObjectInputStream(new FileInputStream("StName"));
            s = (Student) fp.readObject();
            fp.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if(Build.VERSION.SDK_INT>=21){
            Window w=this.getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            w.setStatusBarColor(getResources().getColor(R.color.harshs));
        }
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   t.setText(g);
                Intent h=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(getApplicationContext(),"Selecting Library",Toast.LENGTH_SHORT).show();
                startActivity(h);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(MainActivity.this,Main3Activity.class);
                Toast.makeText(getApplicationContext(),"Selecting Monetary",Toast.LENGTH_SHORT).show();
                startActivity(h);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent h=new Intent(MainActivity.this,Main4Activity.class);
                Toast.makeText(getApplicationContext(),"Selecting Attendance",Toast.LENGTH_SHORT).show();
                startActivity(h);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(MainActivity.this,Main5Activity.class);
                Toast.makeText(getApplicationContext(),"Selecting Assignments",Toast.LENGTH_SHORT).show();
                startActivity(h);

            }
        });

    }

}
