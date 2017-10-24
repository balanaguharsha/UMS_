package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harshavardhan.a2z.entry.Student;
import com.example.harshavardhan.a2z.monetary.Transaction;

import java.io.*;

public class SendTo extends AppCompatActivity {
    EditText e12,bh;
    Button nh;
    Student s=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            ObjectInputStream x = new ObjectInputStream(getApplicationContext().openFileInput("StName"));
            s=(Student)x.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_to);
        e12=(EditText)findViewById(R.id.editText);
        bh=(EditText)findViewById(R.id.editText3);
        nh=(Button)findViewById(R.id.button4);
        nh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e12.getText().toString();
                Double amo=Double.parseDouble(bh.getText().toString());
                Transaction t = new Transaction();
                if(t.check(amo,s))
                {
                    final Intent i=new Intent(getApplicationContext(),confirmaion.class);
                    i.putExtra("obj",amo);
                    startActivity(i);
                }
                else
                {
                    startActivity(new Intent(getApplicationContext(),popup.class));
                }
            }
        });



    }
}
