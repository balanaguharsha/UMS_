package com.example.harshavardhan.a2z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.harshavardhan.a2z.entry.Student;
import com.example.harshavardhan.a2z.monetary.Transaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class confirmaion extends AppCompatActivity {
    EditText x;
    Button y;
    Student s;
    double amo=getIntent().getDoubleExtra("obj",0.0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmaion);
        x=(EditText)findViewById(R.id.editText3);
        y=(Button) findViewById(R.id.button5);

       y.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String pass=x.getText().toString();
               try{
                   ObjectInputStream fp = new ObjectInputStream(getApplicationContext().openFileInput("StName"));
                   s=(Student) fp.readObject();
                   fp.close();
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               }
               if(pass.contentEquals(s.getPass()))
               {
                   Transaction t = new Transaction();
                   try {
                       t.withdraw(amo,s);
                   } catch (IOException e) {
                       e.printStackTrace();
                   } catch (ClassNotFoundException e) {
                       e.printStackTrace();
                   }

               }

           }
       });

    }
}
