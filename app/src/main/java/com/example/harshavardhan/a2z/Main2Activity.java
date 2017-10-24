package com.example.harshavardhan.a2z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.*;
import com.example.harshavardhan.a2z.entry.Student;
import com.example.harshavardhan.a2z.library.Book;
import com.example.harshavardhan.a2z.inputOutput.UpdateBooks;
import com.example.harshavardhan.a2z.library.Lib;

public class Main2Activity extends AppCompatActivity {

    Button bu1, bu2;
    UpdateBooks book = new UpdateBooks();
    Book b[];
    Student s = new Student();

    public Main2Activity() throws IOException, ClassNotFoundException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            ObjectInputStream fp = new ObjectInputStream(getApplicationContext().openFileInput("StName"));
            s = (Student) fp.readObject();
            fp.close();
            b = book.f(getApplicationContext());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bu1 = (Button) findViewById(R.id.bu1);
        bu2 = (Button) findViewById(R.id.bu2);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lib l = new Lib();
                if (l.BooksInHand(s, b)) {
                    Toast.makeText(getApplicationContext(), R.string.gg, Toast.LENGTH_SHORT).show();
                } else {
                    Intent inj = new Intent(getApplicationContext(), Main6Activity.class);
                    inj.putExtra("obj", s);
                    inj.putExtra("obj1", b);
                    startActivity(inj);
                }

            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inj = new Intent(getApplicationContext(), Main7Activity.class);
                inj.putExtra("obj1", b);
                startActivity(inj);
            }
        });

    }
}